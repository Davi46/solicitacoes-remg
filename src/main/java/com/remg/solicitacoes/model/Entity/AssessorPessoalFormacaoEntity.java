package com.remg.solicitacoes.model.Entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AssessorPessoalFormacao")
public class AssessorPessoalFormacaoEntity extends MembroBaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorLinhaFormacao")
    private LinhaFormacaoEntity linhaFormacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorNivelFormacao")
    private NivelFormacaoEntity nivelFormacao;
}