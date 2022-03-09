package project.analisis2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.analisis2.model.Usuario;
import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    void deleteUsuarioById(Long id);

    Optional<Usuario> findUsuarioById(Long id);
}
