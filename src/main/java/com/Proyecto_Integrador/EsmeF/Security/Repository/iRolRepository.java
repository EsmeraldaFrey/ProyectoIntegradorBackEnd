
package com.Proyecto_Integrador.EsmeF.Security.Repository;

import com.Proyecto_Integrador.EsmeF.Security.Entity.Rol;
import com.Proyecto_Integrador.EsmeF.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
