package com.remg.solicitacoes.Model;

import com.remg.solicitacoes.Model.Enum.LinhaFormacaoEnum;
import com.remg.solicitacoes.Model.Enum.NivelFormacaoEnum;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssessorPessoalFormacao extends Membro{
    private LinhaFormacaoEnum linhaFormacao;
    private NivelFormacaoEnum nivelFormacao;
    private String telefone;
    private String celular;

    @Builder
    public AssessorPessoalFormacao(int registro, String nome, GrupoEscoteiro grupoEscoteiro, LinhaFormacaoEnum linhaFormacao) {
        super(registro, nome, grupoEscoteiro);
        this.linhaFormacao = linhaFormacao;
    }
}