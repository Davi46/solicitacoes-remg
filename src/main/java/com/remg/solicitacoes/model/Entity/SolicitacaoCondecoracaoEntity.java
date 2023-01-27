package com.remg.solicitacoes.model.Entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SolicitacaoCondecoracao")
public class SolicitacaoCondecoracaoEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID identificador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorAgraciado")
    private AgraciadoEntity agraciado;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CondecoracaoEntity.class)
    @JoinColumn(name = "identificadorCondecoracao")
    private CondecoracaoEntity condecoracao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitante")
    private SolicitanteEntity solicitante;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorSolicitacao")
    private SolicitacaoEntity solicitacao;
}