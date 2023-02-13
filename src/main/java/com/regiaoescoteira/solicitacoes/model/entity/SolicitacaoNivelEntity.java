package com.regiaoescoteira.solicitacoes.model.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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
    @GeneratedValue(generator = "UUID")
    @ColumnDefault("random_uuid()")
    @Type(type = "uuid-char")
    private UUID identificador;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "identificadorAssessorPessoalFormacao")
    private AssessorPessoalFormacaoEntity assessorPessoalFormacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "identificadorNivelFormacaoSolicitado")
    private NivelFormacaoEntity nivelFormacaoSolicitado;

    @Column(nullable=false)
    private File arquivoSolicitacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}