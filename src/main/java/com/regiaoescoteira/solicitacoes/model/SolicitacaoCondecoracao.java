package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.List;
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
    public SolicitacaoCondecoracao(long identificador, UUID identificadorSolicitacao, TipoSolicitacaoEnum tipoSolicitacaoEnum, OffsetDateTime criacao, OffsetDateTime finalizado, String justificativa, List<StatusSolicitacao> historico) {
        super(identificador, identificadorSolicitacao, tipoSolicitacaoEnum, criacao, finalizado, justificativa, historico);
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