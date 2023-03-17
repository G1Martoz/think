package com.green.think.repositorios;

import com.green.think.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositorioUsuario extends JpaRepository<Usuario, String>{
    
    @Query("SELECT c FROM Usuario c WHERE c.email = :email")
    public Usuario buscarEmail(String email);
    
}
