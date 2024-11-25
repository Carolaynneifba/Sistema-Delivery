package com.ifba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String complemento;
    private Cidade cidade;

}
