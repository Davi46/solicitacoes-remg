package com.regiaoescoteira.solicitacoes.model.dto;

import com.regiaoescoteira.solicitacoes.model.dto.enums.StatusDtoEnum;
import com.regiaoescoteira.solicitacoes.model.dto.enums.TipoSolicitacaoDtoEnum;
import com.remg.solicitacoes.model.dto.enums.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoDistintivoDto extends SolicitacaoDto {
    private AgraciadoDto agraciado;
    private DistintivoDto distintivo;
    private SolicitanteDto solicitante;

    @Builder
    public SolicitacaoDistintivoDto(UUID identificador, TipoSolicitacaoDtoEnum tipoSolicitacaoEnum, StatusDtoEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }
}