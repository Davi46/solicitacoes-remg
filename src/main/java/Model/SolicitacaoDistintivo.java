package Model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoDistintivo extends Solicitacao{
    private Agraciado agraciado;
    private Distintivo distintivo;
    private Solicitante solicitante;
}
