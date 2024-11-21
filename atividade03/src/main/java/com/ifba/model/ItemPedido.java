package com.ifba.model;

import java.math.BigDecimal;

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

public class ItemPedido {
    
    private int quantidade;
    private BigDecimal valorTotal;
    private String observacao;
    private Produto produto;

}
