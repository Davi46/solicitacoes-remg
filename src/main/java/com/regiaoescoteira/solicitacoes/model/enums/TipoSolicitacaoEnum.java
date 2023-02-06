package com.regiaoescoteira.solicitacoes.model.enums;

public enum TipoSolicitacaoEnum {
    DISTINTIVO_ESPECIAL(1),
    SEMEADOR(2),
    CONDECORACOES(3),
    NIVEL_FORMACAO(4);

    private int value;

    public int getValue() {
        return value;
    }

    TipoSolicitacaoEnum(int value) {
        this.value = value;
    }
}
