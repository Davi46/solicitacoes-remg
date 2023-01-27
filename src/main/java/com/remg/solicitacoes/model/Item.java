package com.remg.solicitacoes.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private UUID identificador;
    private String nome;
    private boolean status;
}
