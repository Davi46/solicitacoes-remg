package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoCondecoracao extends Solicitacao {
    private Agraciado agraciado;
    private Condecoracao condecoracao;
    private Solicitante solicitante;
    private boolean estojo;

    @Builder
    public SolicitacaoCondecoracao(UUID identificador, TipoSolicitacaoEnum tipoSolicitacaoEnum, StatusEnum statusEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String observacao, String justificativa) {
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