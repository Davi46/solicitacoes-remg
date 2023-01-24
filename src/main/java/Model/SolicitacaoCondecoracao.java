package Model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoCondecoracao extends Solicitacao{
    private Agraciado agraciado;
    private Condecoracao distintivo;
}
