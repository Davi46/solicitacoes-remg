package com.regiaoescoteira.solicitacoes.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GrupoEscoteiro {
    private Long identificador;
    private int numeroGrupo;
    private String nomeGrupo;
}