package com.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor


public class FormaPagamento {
    private UUID id;
    private String nome;
    private String bandeira;

}
