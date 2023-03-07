package com.regiaoescoteira.solicitacoes.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusSolicitacao {

    private Long identificador;

    private String observacao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private OffsetDateTime criacao;

    private StatusEnum status;

    @Override
    public String toString() {
        return "StatusSolicitacao{" +
                "identificador=" + identificador +
                ", observacao='" + observacao + '\'' +
                ", criacao=" + criacao +
                ", status=" + status +
                '}';
    }
}