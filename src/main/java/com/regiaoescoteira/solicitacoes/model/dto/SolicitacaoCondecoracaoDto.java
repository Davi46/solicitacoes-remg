package com.regiaoescoteira.solicitacoes.model.dto;

import com.regiaoescoteira.solicitacoes.model.dto.enums.StatusDtoEnum;
import com.regiaoescoteira.solicitacoes.model.dto.enums.TipoSolicitacaoDtoEnum;
import com.remg.solicitacoes.model.dto.enums.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoCondecoracaoDto extends SolicitacaoDto {
    private AgraciadoDto agraciado;
    private CondecoracaoDto condecoracao;
    private SolicitanteDto solicitante;
    private boolean estojo;

    @Builder
    public SolicitacaoCondecoracaoDto(UUID identificador, TipoSolicitacaoDtoEnum tipoSolicitacaoEnum, StatusDtoEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
        super(identificador, tipoSolicitacaoEnum, statusEnum, criacao, finalizado, observacao, justificativa);
    }

    @Override
    public String toString() {
        return "SolicitacaoCondecoracao{" +
                "agraciado=" + agraciado +
                ", condecoracao=" + condecoracao +
                ", solicitante=" + solicitante +
                ", estojo=" + estojo +
                '}';
    }
}