package com.regiaoescoteira.solicitacoes.model;

import lombok.*;

@Getter
@Setter
@Builder
public class Distintivo extends Item {
    public Distintivo(){
        super();
    }

    @Builder
    public Distintivo(long identificador, String nome, boolean status) {
        super(identificador, nome, status);
    }
}