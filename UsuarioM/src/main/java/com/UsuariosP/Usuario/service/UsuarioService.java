package com.UsuariosP.Usuario.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.UsuariosP.Usuario.model.Usuario;
import com.UsuariosP.Usuario.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crear (Usuario usuario){
        usuario.setFechaRegistro(LocalDateTime.now());
        usuario.setEstadoUsuario("ACTIVO");
        return usuarioRepository.save(usuario);

    }

    public List <Usuario> listar(){
        return usuarioRepository.findAll();
    }

    public Usuario modificarUsuario(Long id, Usuario usuario){
        Usuario existente = usuarioRepository.findById(id).orElse(null);

        if (existente != null) {
            existente.setNombre(usuario.getNombre());
            existente.setApellido(usuario.getApellido());
            existente.setEmail(usuario.getEmail());
            existente.setTelefono(usuario.getTelefono());
            existente.setEstadoUsuario(usuario.getEstadoUsuario());
        }
        return usuarioRepository.save(existente);
    }

    public Usuario desactivar(Long id){
        Usuario existente = usuarioRepository.findById(id).orElse(null);

        if (existente != null) {
            existente.setEstadoUsuario("INACTIVO");
            return usuarioRepository.save(existente);
        }
        return null;
    }

    public void eliminar(Long id){
        usuarioRepository.deleteById(id);
    }

}
