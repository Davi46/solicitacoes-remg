package com.regiaoescoteira.solicitacoes.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private long identificador;
    private String nome;
    private boolean status;
    private String descricao;
}
