package com.portfolio.gjs.Repository;

import com.portfolio.gjs.Entity.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LaC-I7
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
