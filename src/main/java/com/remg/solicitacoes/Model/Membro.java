package com.remg.solicitacoes.Model;

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