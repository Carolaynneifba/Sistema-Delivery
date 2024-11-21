package com.ifba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String complemento;
}
