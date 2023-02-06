package com.regiaoescoteira.solicitacoes.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private long identificador;
    private String nome;
    private boolean status;
}
