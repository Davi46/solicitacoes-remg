package com.regiaoescoteira.solicitacoes.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Solicitante extends Membro {
    private String telefone;
    private String celular;
    private String funcao;
    private String email;

    @Builder
    public Solicitante(int registro, String nome, GrupoEscoteiro grupoEscoteiro, String telefone, String celular, String funcao) {
        super(registro, nome, grupoEscoteiro);
        this.telefone = telefone;
        this.celular = celular;
        this.funcao = funcao;
    }
}