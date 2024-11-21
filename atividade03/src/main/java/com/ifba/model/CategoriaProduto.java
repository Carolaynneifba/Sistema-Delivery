package com.ifba.model;

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

public class CategoriaProduto {
    private UUID id;
    private String nome;
    private String descricao;

}
