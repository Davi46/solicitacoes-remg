package com.remg.solicitacoes.model;

import com.remg.solicitacoes.model.Enum.StatusEnum;
import com.remg.solicitacoes.model.Enum.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Solicitacao {
    private UUID identificador;
    private TipoSolicitacaoEnum tipoSolicitacaoEnum;
    private StatusEnum statusEnum;
    private OffsetDateTime criacao;
    private OffsetDateTime finalizado;
    private String observacao;
    private String justificativa;

    @Override
    public String toString() {
        return "Solicitacao{" +
                "identificador=" + identificador +
                ", tipoSolicitacaoEnum=" + tipoSolicitacaoEnum +
                ", statusEnum=" + statusEnum +
                ", criacao=" + criacao +
                ", finalizado=" + finalizado +
                ", observacao='" + observacao + '\'' +
                ", justificativa='" + justificativa + '\'' +
                '}';
    }
}