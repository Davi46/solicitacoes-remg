package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.NivelFormacaoEnum;
import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.io.File;
import java.time.OffsetDateTime;
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
    public SolicitacaoNivel(UUID identificador, TipoSolicitacaoEnum tipoSolicitacaoEnum, StatusEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}