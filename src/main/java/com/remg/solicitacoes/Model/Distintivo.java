package com.remg.solicitacoes.Model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
public class Distintivo extends Item{
    public Distintivo(){
        super();
    }

    @Builder
    public Distintivo(UUID identificador, String nome, boolean status) {
        super(identificador, nome, status);
    }
}