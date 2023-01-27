package com.remg.solicitacoes.model;

import com.remg.solicitacoes.model.Enum.StatusEnum;
import com.remg.solicitacoes.model.Enum.TipoSolicitacaoEnum;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoCondecoracao extends Solicitacao{
    private Agraciado agraciado;
    private Condecoracao distintivo;
    private Solicitante solicitante;

    @Builder
    public SolicitacaoCondecoracao(UUID identificador, TipoSolicitacaoEnum tipoSolicitacaoEnum, StatusEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}