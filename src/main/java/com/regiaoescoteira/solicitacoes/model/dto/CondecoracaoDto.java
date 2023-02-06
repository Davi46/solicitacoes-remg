package com.regiaoescoteira.solicitacoes.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class CondecoracaoDto extends ItemDto {
    public CondecoracaoDto(){
        super();
    }

    @Builder
    public CondecoracaoDto(long identificador, String nome, boolean status) {
        super(identificador, nome, status);
    }
}