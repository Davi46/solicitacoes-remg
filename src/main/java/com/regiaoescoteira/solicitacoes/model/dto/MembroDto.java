package com.regiaoescoteira.solicitacoes.model.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MembroDto {
    private int registro;
    private String nome;
    private GrupoEscoteiroDto grupoEscoteiro;
}