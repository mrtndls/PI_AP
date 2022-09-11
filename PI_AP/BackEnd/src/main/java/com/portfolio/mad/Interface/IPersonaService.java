package com.portfolio.mad.Interface;

import com.portfolio.mad.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer 1 persona
    public List<Persona> getPersona();
    
    //guardar 1 obj de tipo persona
    public void savePersona (Persona persona);
    
    //eliminar usuario por id
    public void deletePersona (Long id);
    
    //buscar 1 persona por id
    public Persona findPersona (Long id);
    
}
