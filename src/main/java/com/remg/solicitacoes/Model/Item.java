package com.remg.solicitacoes.Model;

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
