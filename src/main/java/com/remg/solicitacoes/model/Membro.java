package com.remg.solicitacoes.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Membro {
    private int registro;
    private String nome;
    private GrupoEscoteiro grupoEscoteiro;
}