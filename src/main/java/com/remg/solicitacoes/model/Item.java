package com.remg.solicitacoes.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private long identificador;
    private String nome;
    private boolean status;
}
