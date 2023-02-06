package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import com.remg.solicitacoes.model.enums.*;
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