package com.regiaoescoteira.solicitacoes.model.dto.enums;

public enum NivelFormacaoDtoEnum {
    PRELIMINAR(1),
    INTERMEDIARIO(2),
    AVANCADO (3);

    private int value;

    public int getValue() {
        return value;
    }

    NivelFormacaoDtoEnum(int value) {
        this.value = value;
    }
}
