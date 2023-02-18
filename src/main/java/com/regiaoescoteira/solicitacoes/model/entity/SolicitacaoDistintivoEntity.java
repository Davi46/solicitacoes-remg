package com.regiaoescoteira.solicitacoes.model.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitacaoDistintivo")
public class SolicitacaoDistintivoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long identificador;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "identificadorAgraciado")
    private AgraciadoEntity agraciado;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "identificadorDistintivo")
    private DistintivoEntity distintivo;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "identificadorSolicitante")
    private SolicitanteEntity solicitante;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}