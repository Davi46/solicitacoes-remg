package com.regiaoescoteira.solicitacoes.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SolicitanteDto extends MembroDto {
    private String telefone;
    private String celular;
    private String funcao;

    @Builder
    public SolicitanteDto(int registro, String nome, GrupoEscoteiroDto grupoEscoteiro, String telefone, String celular, String funcao) {
        super(registro, nome, grupoEscoteiro);
        this.telefone = telefone;
        this.celular = celular;
        this.funcao = funcao;
    }
}