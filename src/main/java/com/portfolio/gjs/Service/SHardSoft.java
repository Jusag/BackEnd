package com.portfolio.gjs.Service;

import com.portfolio.gjs.Entity.HardSoft;
import com.portfolio.gjs.Repository.RHardSoft;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHardSoft {
    @Autowired
    RHardSoft rHardSoft;
    
    
    public List<HardSoft> list(){
        return rHardSoft.findAll();
    }
    
    public Optional<HardSoft> getOne(int id){
        return rHardSoft.findById(id);
    }
    
    public Optional<HardSoft> getByNombreE(String nombreE){
        return rHardSoft.findByNombreHS(nombreE);
    }
    
    public void save(HardSoft hardSoft){
        rHardSoft.save(hardSoft);
    }
    
    public void delete(int id){
        rHardSoft.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHardSoft.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreHS){
        return rHardSoft.existsByNombreHS(nombreHS);
    }
}
