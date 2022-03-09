package project.analisis2.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import project.analisis2.exception.UsuarioNotFound;
import project.analisis2.model.Usuario;
import project.analisis2.repo.UsuarioRepo;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;


    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }

    public Usuario addUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> findAllUsuarios(){
        return usuarioRepo.findAll();
    }

    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public Usuario findUsuarioById(Long id) {
        return usuarioRepo.findUsuarioById(id)
                .orElseThrow(() -> new UsuarioNotFound("Usuario con codigo " + id + " no fue encontrado"));
    }

   public void deleteUsuario(Long id){
       usuarioRepo.deleteUsuarioById(id);
   }
}
