package Model;

import Model.Enum.NivelFormacaoEnum;
import lombok.*;

import java.io.File;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoNivel extends Solicitacao{
    private AssessorPessoalFormacao assessorPessoalFormacao;
    private NivelFormacaoEnum nivelFormacaoEnumSolicitado;
    private File arquivoSolicitacao;
}