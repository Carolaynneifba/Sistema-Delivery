package com.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Loja {
     private UUID id;
    private String nome;
    private LocalDateTime dataCadastro;
    private LocalDateTime horarioAbertura;
    private LocalDateTime horarioFechamento;
    private boolean ativo;
    private boolean escalaRetirada;
    private boolean aceitaDelivery;
    private BigDecimal taxaDelivery;
    private int tempoMinimoEntrega;
    private int tempoMaximoEntrega;
    private Map<String, String> contatos;
    private String urlFotoBanner;
    private List<Usuario> responsaveis;
    private List<FormaPagamento> formasPagamento;
    private List<Produto> produtos;

}
