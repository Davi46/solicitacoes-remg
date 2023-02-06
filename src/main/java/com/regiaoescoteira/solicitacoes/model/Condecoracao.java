package com.regiaoescoteira.solicitacoes.model;

import lombok.*;

@Getter
@Setter
@Builder
public class Condecoracao extends Item {
    public Condecoracao(){
        super();
    }

    @Builder
    public Condecoracao(long identificador, String nome, boolean status) {
        super(identificador, nome, status);
    }
}