package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoDistintivo extends Solicitacao {
    private Agraciado agraciado;
    private Distintivo distintivo;
    private Solicitante solicitante;

    @Builder
    public SolicitacaoDistintivo(long identificador, UUID identificadorSolicitacao, TipoSolicitacaoEnum tipoSolicitacaoEnum, StatusEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, identificadorSolicitacao, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}