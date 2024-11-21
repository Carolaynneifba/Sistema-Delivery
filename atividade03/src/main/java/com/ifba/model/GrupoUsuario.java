package com.ifba.model;

import java.util.List;
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


public class GrupoUsuario {
    private UUID id;
    private String nome;
    private List<PermissaoUsuario> permissoes;

}