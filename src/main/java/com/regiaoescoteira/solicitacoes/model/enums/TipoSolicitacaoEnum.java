package com.regiaoescoteira.solicitacoes.model.enums;

public enum TipoSolicitacaoEnum {
    DISTINTIVO_ESPECIAL(1),
    SEMEADOR(2),
    CONDECORACOES(3),
    NIVEL_FORMACAO(4);

    private long value;

    public long getValue() {
        return value;
    }

    TipoSolicitacaoEnum(long value) {
        this.value = value;
    }
}
