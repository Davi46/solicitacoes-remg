package com.regiaoescoteira.solicitacoes.model.dto.enums;

public enum TipoSolicitacaoDtoEnum {
    DISTINTIVO_ESPECIAL(1),
    SEMEADOR(2),
    CONDECORACOES(3),
    NIVEL_FORMACAO(4);

    private int value;

    public int getValue() {
        return value;
    }

    TipoSolicitacaoDtoEnum(int value) {
        this.value = value;
    }
}
