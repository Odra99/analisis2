package project.analisis2.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import project.analisis2.model.Usuario;
import project.analisis2.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioResource {
    
    private final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        List<Usuario> usuarios = usuarioService.findAllUsuarios();
        return new ResponseEntity<>(usuarios,HttpStatus.OK);
    } 

    @GetMapping("/find/{id}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("id") Long id){
        Usuario usuario = usuarioService.findUsuarioById(id);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    } 

    @PostMapping("/add")
    public ResponseEntity<Usuario> addEmployee(@RequestBody Usuario usuario) {
        Usuario newUsuario = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> updateEmployee(@RequestBody Usuario usuario) {
        Usuario updateUsuario = usuarioService.updateUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
