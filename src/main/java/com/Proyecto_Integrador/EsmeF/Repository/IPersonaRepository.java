
package com.Proyecto_Integrador.EsmeF.Repository;

import com.Proyecto_Integrador.EsmeF.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
