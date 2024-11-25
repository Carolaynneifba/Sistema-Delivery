package com.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CategoriaProduto {
    private UUID id;
    private String nome;
    private String descricao;
    private Produto produto;

}
