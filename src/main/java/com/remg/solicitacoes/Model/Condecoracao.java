package com.remg.solicitacoes.Model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
public class Condecoracao extends Item{
    public Condecoracao(){
        super();
    }

    @Builder
    public Condecoracao(UUID identificador, String nome, boolean status) {
        super(identificador, nome, status);
    }
}