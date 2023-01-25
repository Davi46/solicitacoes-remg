package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Solicitacao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class SolicitacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID identificador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorTipoSolicitacao")
    private TipoSolicitacaoEntity tipoSolicitacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorTipoStatus")
    private StatusEntity status;

    @Column(nullable=false)
    private OffsetDateTime criacao;

    @Column(nullable=true)
    private OffsetDateTime finalizado;

    @Column(nullable=true)
    private String observacao;

    @Column(nullable=false)
    private String justificativa;
}