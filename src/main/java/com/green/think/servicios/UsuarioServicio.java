package com.green.think.servicios;

import com.green.think.entidades.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    
    // Registro de usuario
    public void registrar(String nombre, String email, String password){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
    }
    
    // Crear publicacion con img
    
    
    
    // Comentar publicacion
    
    
    
}
