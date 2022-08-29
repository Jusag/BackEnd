
package com.portfolio.gjs.Repository;

import com.portfolio.gjs.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByTituloE(String tituloE);
    public boolean existsByTituloE(String tituloE);
}
