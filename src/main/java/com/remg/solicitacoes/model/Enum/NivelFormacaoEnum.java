package com.remg.solicitacoes.model.Enum;

public enum NivelFormacaoEnum {
    PRELIMINAR(1),
    INTERMEDIARIO(2),
    AVANCADO (3);

    private int value;

    public int getValue() {
        return value;
    }

    NivelFormacaoEnum(int value) {
        this.value = value;
    }
}
