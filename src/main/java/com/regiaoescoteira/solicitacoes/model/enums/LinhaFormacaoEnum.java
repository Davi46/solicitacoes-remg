package com.regiaoescoteira.solicitacoes.model.enums;

public enum LinhaFormacaoEnum {
    ESCOTISTA(1),
    DIRIGENTE(2);

    private int value;

    public int getValue() {
        return value;
    }

    LinhaFormacaoEnum(int value) {
        this.value = value;
    }
}