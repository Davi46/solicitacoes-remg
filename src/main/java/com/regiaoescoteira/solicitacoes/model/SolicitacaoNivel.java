package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.NivelFormacaoEnum;
import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoNivel extends Solicitacao {
    private AssessorPessoalFormacao assessorPessoalFormacao;
    private NivelFormacaoEnum nivelFormacaoEnumSolicitado;
    private File arquivoSolicitacao;

    @Builder
    public SolicitacaoNivel(long identificador, UUID identificadorSolicitacao, TipoSolicitacaoEnum tipoSolicitacaoEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String justificativa, List<StatusSolicitacao> historico) {
        super(identificador, identificadorSolicitacao, tipoSolicitacaoEnum,criacao, finalizado, justificativa, historico);
    }
}