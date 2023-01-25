package com.remg.solicitacoes.Model.Entity;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;
import java.io.File;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SolicitacaoNivel")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class SolicitacaoNivelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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