package com.portfolio.mhm.Interface;

import com.portfolio.mhm.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista personas
    public List<Persona> getPersona();
    
    //Guardar obj tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un obj buscando por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
