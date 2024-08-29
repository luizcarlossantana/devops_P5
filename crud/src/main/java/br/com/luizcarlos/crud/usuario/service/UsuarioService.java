package br.com.luizcarlos.crud.usuario.service;

import br.com.luizcarlos.crud.usuario.model.Usuario;
import br.com.luizcarlos.crud.usuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario save(Usuario usuario) {
       return repository.save(usuario);
    }
}
