package com.regiaoescoteira.solicitacoes.model.dto;

import com.regiaoescoteira.solicitacoes.model.dto.enums.NivelFormacaoDtoEnum;
import com.regiaoescoteira.solicitacoes.model.dto.enums.StatusDtoEnum;
import com.regiaoescoteira.solicitacoes.model.dto.enums.TipoSolicitacaoDtoEnum;
import lombok.*;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoNivelDto extends SolicitacaoDto {
    private AssessorPessoalFormacaoDto assessorPessoalFormacao;
    private NivelFormacaoDtoEnum nivelFormacaoEnumSolicitado;
    private File arquivoSolicitacao;

    @Builder
    public SolicitacaoNivelDto(UUID identificador, TipoSolicitacaoDtoEnum tipoSolicitacaoEnum, StatusDtoEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}