package com.portfolio.gjs.Controller;

import com.portfolio.gjs.Dto.dtoHardSoft;
import com.portfolio.gjs.Entity.HardSoft;
import com.portfolio.gjs.Security.Controller.Mensaje;
import com.portfolio.gjs.Service.SHardSoft;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hardsoft")
//@CrossOrigin(origins = "https://frontendtest900.web.app/")
@CrossOrigin(origins = "http://localhost:4200")
public class CHardSoft {
    @Autowired
    SHardSoft sHardSoft;
    
    @GetMapping("/lista")
    public ResponseEntity<List<HardSoft>> list() {
        List<HardSoft> list = sHardSoft.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HardSoft> getById(@PathVariable("id") int id){
        if(!sHardSoft.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        HardSoft hardSoft = sHardSoft.getOne(id).get();
        return new ResponseEntity(hardSoft, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHardSoft dtoHsoft) {
        if (StringUtils.isBlank(dtoHsoft.getNombreHS())) {
            return new ResponseEntity(new Mensaje("Nombre Obligatiorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHardSoft.existsByNombreE(dtoHsoft.getNombreHS())) {
            return new ResponseEntity(new Mensaje("Esa Experiencia ya existe"), HttpStatus.BAD_REQUEST);
        }
        HardSoft hardSoft = new HardSoft(
                dtoHsoft.getNombreHS(),
                dtoHsoft.getPorcentajeHS()
                );
        sHardSoft.save(hardSoft);
        return new ResponseEntity(new Mensaje("Experiencia Agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHardSoft dtoHsoft) {
        if(!sHardSoft.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        if(sHardSoft.existsByNombreE(dtoHsoft.getNombreHS()) && sHardSoft.getByNombreE(dtoHsoft.getNombreHS()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Esa Experiencia YA existe"),HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoHsoft.getNombreHS())){
            return new ResponseEntity(new Mensaje("Nombre NO puede quedar en blanco"),HttpStatus.BAD_REQUEST);
        }
        
        HardSoft shardSoft = sHardSoft.getOne(id).get();
        
        shardSoft.setNombreHS(dtoHsoft.getNombreHS());
        shardSoft.setPorcentajeHS(dtoHsoft.getPorcentajeHS());
        
        sHardSoft.save(shardSoft);
        return new ResponseEntity(new Mensaje("Experiencia Actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHardSoft.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHardSoft.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
}
