package com.remg.solicitacoes.Model;

import com.remg.solicitacoes.Model.Enum.StatusEnum;
import com.remg.solicitacoes.Model.Enum.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Solicitacao {
    private UUID identificador;
    private TipoSolicitacaoEnum tipoSolicitacaoEnum;
    private StatusEnum statusEnum;
    private OffsetDateTime criacao;
    private OffsetDateTime finalizado;
    private String observacao;
    private String justificativa;
}