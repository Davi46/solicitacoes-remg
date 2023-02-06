package com.regiaoescoteira.solicitacoes.model.dto;

import lombok.*;

@Getter
@Setter
public class AgraciadoDto extends MembroDto {
    public AgraciadoDto(){
        super();
    }

    @Builder
    public AgraciadoDto(int registro, String nome, GrupoEscoteiroDto grupoEscoteiro) {
        super(registro, nome, grupoEscoteiro);
    }
}