package com.regiaoescoteira.solicitacoes.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class DistintivoDto extends ItemDto {
    public DistintivoDto(){
        super();
    }

    @Builder
    public DistintivoDto(long identificador, String nome, boolean status) {
        super(identificador, nome, status);
    }
}