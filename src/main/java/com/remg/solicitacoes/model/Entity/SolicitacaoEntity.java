package com.remg.solicitacoes.model.Entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Solicitacao")
public class SolicitacaoEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
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