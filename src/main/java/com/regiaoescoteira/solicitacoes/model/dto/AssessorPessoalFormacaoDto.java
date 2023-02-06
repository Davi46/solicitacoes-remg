package com.regiaoescoteira.solicitacoes.model.dto;

import com.regiaoescoteira.solicitacoes.model.dto.enums.LinhaFormacaoDtoEnum;
import com.regiaoescoteira.solicitacoes.model.dto.enums.NivelFormacaoDtoEnum;
import com.remg.solicitacoes.model.dto.enums.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssessorPessoalFormacaoDto extends MembroDto {
    private LinhaFormacaoDtoEnum linhaFormacao;
    private NivelFormacaoDtoEnum nivelFormacao;
    private String telefone;
    private String celular;

    @Builder
    public AssessorPessoalFormacaoDto(int registro, String nome, GrupoEscoteiroDto grupoEscoteiro, LinhaFormacaoDtoEnum linhaFormacao) {
        super(registro, nome, grupoEscoteiro);
        this.linhaFormacao = linhaFormacao;
    }
}