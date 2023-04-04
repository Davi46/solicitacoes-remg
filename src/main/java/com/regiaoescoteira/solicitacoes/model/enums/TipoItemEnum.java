package com.regiaoescoteira.solicitacoes.model.enums;

public enum TipoItemEnum {
    TIPO_SOLICITACAO(1),
    TIPO_CONDECORACAO(2),
    STATUS(3);

    private long value;

    public long getValue() {
        return value;
    }

    TipoItemEnum(long value) {
        this.value = value;
    }

    public static TipoItemEnum getByCodigo(long cod) {
        for (TipoItemEnum n : values()) {
            if (n.getValue() == cod) {
                return n;
            }
        }
        throw new IllegalArgumentException("Status invalido: " + cod);
    }
}
