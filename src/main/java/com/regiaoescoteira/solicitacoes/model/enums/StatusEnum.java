package com.regiaoescoteira.solicitacoes.model.enums; 

public enum StatusEnum {
    RECEBIDA(1),
    EM_ANALISE(2),
    INDEFERIDO(3),
    DEFERIDO(4),
    APROVADO_AGUARDANDO_PAGAMENTO(5),
    AGUARDANDO_ALTERACOES_SOLICITADAS(6),
    EMITIDO(7),
    ENVIADO_AO_ESCRITORIO_NACIONAL(8),
    ENVIADO_AO_SOLICITANTE(9);

    private long value;

    public long getValue() {
        return value;
    }

    StatusEnum(long value) {
        this.value = value;
    }

    public static StatusEnum getByCodigo(long cod) {
        for (StatusEnum n : values()) {
            if (n.getValue() == cod) {
                return n;
            }
        }
        throw new IllegalArgumentException("Status invalido: " + cod);
    }
}