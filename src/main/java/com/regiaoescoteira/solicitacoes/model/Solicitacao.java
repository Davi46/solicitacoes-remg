package com.regiaoescoteira.solicitacoes.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Solicitacao {
    private long identificador;
    private UUID identificadorSolicitacao;
    private TipoSolicitacaoEnum tipoSolicitacaoEnum;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private OffsetDateTime criacao;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private OffsetDateTime finalizado;
    private String justificativa;
    private List<StatusSolicitacao> historicoSolicitacao;

    @Override
    public String toString() {
        return "Solicitacao{" +
                "identificador=" + identificador +
                ", identificadorSolicitacao=" + identificadorSolicitacao +
                ", tipoSolicitacaoEnum=" + tipoSolicitacaoEnum.getValue() +
                ", criacao=" + criacao +
                ", finalizado=" + finalizado +
                ", justificativa='" + justificativa + '\'' +
                ", historicoSolicitacao=" + historicoSolicitacao +
                '}';
    }
}