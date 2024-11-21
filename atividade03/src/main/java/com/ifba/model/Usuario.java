package com.ifba.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter


public class Usuario {
private UUID id;
    private String nomeCompleto;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    private LocalDateTime nascimento;
    private Genero genero;
    private Map<String, String> contatos;
    private String urlFoto;
    private Endereco enderecoPrincipal;
    private List<Endereco> enderecos;
    private List<PermissaoUsuario> grupos;

}
