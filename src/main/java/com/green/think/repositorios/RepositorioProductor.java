package com.green.think.repositorios;

import com.green.think.entidades.Productor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProductor extends JpaRepository<Productor, String> {

    @Query("SELECT p FROM Productor p WHERE p.productor = :apellido")
    public List<Productor> listarProductores(@Param("apellido") String apellido);
}
