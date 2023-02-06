package com.regiaoescoteira.solicitacoes.model.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitacaoDistintivo")
public class SolicitacaoDistintivoEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID identificador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorAgraciado")
    private AgraciadoEntity agraciado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorDistintivo")
    private DistintivoEntity distintivo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitante")
    private SolicitanteEntity solicitante;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}