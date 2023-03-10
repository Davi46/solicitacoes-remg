package com.regiaoescoteira.solicitacoes.model.dto.enums;

public enum StatusDtoEnum {
    RECEBIDA(1),
    EM_ANALISE(2),
    INDEFERIDO(3),
    DEFERIDO(4),
    APROVADO_AGUARDANDO_PAGAMENTO(5),
    AGUARDANDO_ALTERACOES_SOLICITADAS(6),
    EMITIDO(7),
    ENVIADO_AO_ESCRITORIO_NACIONAL(8),
    ENVIADO_AO_SOLICITANTE(9);

    private int value;

    public int getValue() {
        return value;
    }

    StatusDtoEnum(int value) {
        this.value = value;
    }
}