
package com.Proyecto_Integrador.EsmeF.Interface;

import com.Proyecto_Integrador.EsmeF.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    
    public void savePersona(Persona persona);
    
    //Eliminar un objeto de tipo persona por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
