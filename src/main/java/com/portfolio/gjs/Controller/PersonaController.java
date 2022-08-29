package com.portfolio.gjs.Controller;

import com.portfolio.gjs.Entity.Persona;
import com.portfolio.gjs.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "https://frontendtest900.web.app/")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService  ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona se creo correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePesona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona se elimino correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(
            @PathVariable Long id,
            @RequestBody Persona personaTemp
    )
    {
    Persona persona = ipersonaService.findPersona(id);
    persona.setImg(personaTemp.getImg());
    persona.setImgProfile(personaTemp.getImgProfile());
    persona.setNombre(personaTemp.getNombre());
    persona.setApellido(personaTemp.getApellido());
    persona.setTitulo(personaTemp.getTitulo());
    persona.setDescripcion(personaTemp.getDescripcion());
    
    ipersonaService.savePersona(persona);
    
    return persona;
    
    }
    
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
    
}
