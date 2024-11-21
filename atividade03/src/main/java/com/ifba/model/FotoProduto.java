package com.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @AllArgsConstructor
 @Data
 @NoArgsConstructor
 @Getter
 @Setter

public class FotoProduto {
    private UUID id;
    private String titulo;
    private String descricao;
    private String url;

}
