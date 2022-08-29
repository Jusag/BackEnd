package com.portfolio.gjs.Interface;

import com.portfolio.gjs.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Obtener listado de personas
    public List<Persona> getPersona();
    
    //Guardar objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar usuario por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long ID);
}
