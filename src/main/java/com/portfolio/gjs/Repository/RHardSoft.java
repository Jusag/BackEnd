package com.portfolio.gjs.Repository;

import com.portfolio.gjs.Entity.HardSoft;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHardSoft extends JpaRepository<HardSoft, Integer>{
    public Optional<HardSoft> findByNombreHS(String nombreHS);
    public boolean existsByNombreHS(String nombreHS);
}
