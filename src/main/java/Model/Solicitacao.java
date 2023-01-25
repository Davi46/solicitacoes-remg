package Model;

import Model.Enum.StatusEnum;
import Model.Enum.TipoSolicitacaoEnum;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
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