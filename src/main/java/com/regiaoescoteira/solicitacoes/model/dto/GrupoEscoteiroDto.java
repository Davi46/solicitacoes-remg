package com.regiaoescoteira.solicitacoes.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GrupoEscoteiroDto {
    private int numeroGrupo;
    private String nomeGrupo;
}