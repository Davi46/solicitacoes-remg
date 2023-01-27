package com.remg.solicitacoes.model;

import com.remg.solicitacoes.model.Enum.NivelFormacaoEnum;
import com.remg.solicitacoes.model.Enum.StatusEnum;
import com.remg.solicitacoes.model.Enum.TipoSolicitacaoEnum;
import lombok.*;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoNivel extends Solicitacao{
    private AssessorPessoalFormacao assessorPessoalFormacao;
    private NivelFormacaoEnum nivelFormacaoEnumSolicitado;
    private File arquivoSolicitacao;

    @Builder
    public SolicitacaoNivel(UUID identificador, TipoSolicitacaoEnum tipoSolicitacaoEnum, StatusEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}