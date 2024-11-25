package com.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 @AllArgsConstructor
 @Data
 @NoArgsConstructor
 
public class FotoProduto {
    private UUID id;
    private String titulo;
    private String descricao;
    private String url;

}
