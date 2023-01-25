package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SolicitacaoCondecoracao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class SolicitacaoCondecoracaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID identificador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorAgraciado")
    private AgraciadoEntity agraciado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorCondecoracao")
    private CondecoracaoEntity distintivo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitante")
    private SolicitanteEntity solicitante;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}