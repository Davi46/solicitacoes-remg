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
public class SolicitacaoDto {
    private UUID identificador;
    private TipoSolicitacaoDtoEnum tipoSolicitacaoEnum;
    private StatusDtoEnum statusEnum;
    private OffsetDateTime criacao;
    private OffsetDateTime finalizado;
    private String observacao;
    private String justificativa;

    @Override
    public String toString() {
        return "Solicitacao{" +
                "identificador=" + identificador +
                ", tipoSolicitacaoEnum=" + tipoSolicitacaoEnum +
                ", statusEnum=" + statusEnum +
                ", criacao=" + criacao +
                ", finalizado=" + finalizado +
                ", observacao='" + observacao + '\'' +
                ", justificativa='" + justificativa + '\'' +
                '}';
    }
}