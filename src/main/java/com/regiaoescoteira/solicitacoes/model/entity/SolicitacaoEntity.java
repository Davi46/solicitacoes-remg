package com.regiaoescoteira.solicitacoes.model.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Solicitacao")
public class SolicitacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long identificador;

    @Column(unique = true)
    @Type(type = "uuid-char")
    private UUID identificadorSolicitacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "identificadorTipoSolicitacao")
    private TipoSolicitacaoEntity tipoSolicitacao;

    @Column(nullable=false)
    private OffsetDateTime criacao;

    @Column(nullable=true)
    private OffsetDateTime finalizado;

    @Column(nullable=false)
    private String justificativa;
}