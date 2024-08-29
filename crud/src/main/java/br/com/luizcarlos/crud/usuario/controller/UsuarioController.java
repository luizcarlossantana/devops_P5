package br.com.luizcarlos.crud.usuario.controller;

import br.com.luizcarlos.crud.usuario.model.Usuario;
import br.com.luizcarlos.crud.usuario.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {
private final UsuarioService service;

    @PostMapping("/save")
    public ResponseEntity<Usuario> save(Usuario usuario) {
        service.save(usuario);
        return ResponseEntity.ok().body(service.save(usuario));
    }
}
