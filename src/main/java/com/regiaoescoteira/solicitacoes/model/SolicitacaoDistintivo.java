package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.List;
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
    public SolicitacaoDistintivo(long identificador, UUID identificadorSolicitacao, TipoSolicitacaoEnum tipoSolicitacaoEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String justificativa, List<StatusSolicitacao> historico, StatusSolicitacao ultimoStatus) {
        super(identificador, identificadorSolicitacao, tipoSolicitacaoEnum, criacao, finalizado, justificativa, historico, ultimoStatus);
    }
}