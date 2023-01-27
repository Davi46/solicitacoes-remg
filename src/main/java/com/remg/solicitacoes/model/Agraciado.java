package com.remg.solicitacoes.model;

import lombok.*;

@Getter
@Setter
public class Agraciado extends Membro{
    public Agraciado(){
        super();
    }

    @Builder
    public Agraciado(int registro, String nome, GrupoEscoteiro grupoEscoteiro) {
        super(registro, nome, grupoEscoteiro);
    }
}