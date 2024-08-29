package br.com.luizcarlos.crud.usuario.repository;

import br.com.luizcarlos.crud.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
