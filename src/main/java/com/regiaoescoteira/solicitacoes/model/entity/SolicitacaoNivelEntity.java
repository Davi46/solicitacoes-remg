package com.regiaoescoteira.solicitacoes.model.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.io.File;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SolicitacaoNivel")
public class SolicitacaoNivelEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID identificador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorAssessorPessoalFormacao")
    private AssessorPessoalFormacaoEntity assessorPessoalFormacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorNivelFormacaoSolicitado")
    private NivelFormacaoEntity nivelFormacaoSolicitado;

    @Column(nullable=false)
    private File arquivoSolicitacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}