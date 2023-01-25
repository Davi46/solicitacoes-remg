package Model;

import Model.Enum.LinhaFormacaoEnum;
import Model.Enum.NivelFormacaoEnum;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssessorPessoalFormacao extends Membro{
    private LinhaFormacaoEnum linhaFormacao;
    private NivelFormacaoEnum nivelFormacao;
    private String telefone;
    private String celular;
}