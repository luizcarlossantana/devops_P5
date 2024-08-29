package br.com.luizcarlos.crud.usuario.model;

import br.com.luizcarlos.crud.enumaration.usuario.Permissao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    @Enumerated(EnumType.STRING)
    private Permissao permissao;

}
