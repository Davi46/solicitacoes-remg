package com.regiaoescoteira.solicitacoes.model;

import com.regiaoescoteira.solicitacoes.model.enums.LinhaFormacaoEnum;
import com.regiaoescoteira.solicitacoes.model.enums.NivelFormacaoEnum;
import com.remg.solicitacoes.model.enums.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssessorPessoalFormacao extends Membro {
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