package com.regiaoescoteira.solicitacoes.model.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Setter
@Getter
@Table(name = "StatusSolicitacao")
public class StatusSolicitacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long identificador;

    @Column(nullable=true)
    private String observacao;

    @Column(nullable=false)
    private OffsetDateTime criacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE)
    @JoinColumn(name = "identificadorTipoStatus")
    private StatusEntity status;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}