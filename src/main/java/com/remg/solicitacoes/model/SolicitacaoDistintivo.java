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
public class SolicitacaoDistintivo extends Solicitacao{
    private Agraciado agraciado;
    private Distintivo distintivo;
    private Solicitante solicitante;

    @Builder
    public SolicitacaoDistintivo(UUID identificador, TipoSolicitacaoEnum tipoSolicitacaoEnum, StatusEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}
