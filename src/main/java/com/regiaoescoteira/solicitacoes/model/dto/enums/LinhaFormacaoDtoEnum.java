package com.regiaoescoteira.solicitacoes.model.dto.enums;

public enum LinhaFormacaoDtoEnum {
    ESCOTISTA(1),
    DIRIGENTE(2);

    private int value;

    public int getValue() {
        return value;
    }

    LinhaFormacaoDtoEnum(int value) {
        this.value = value;
    }
}