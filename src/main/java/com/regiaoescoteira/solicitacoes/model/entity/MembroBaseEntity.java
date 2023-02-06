package com.regiaoescoteira.solicitacoes.model.entity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class MembroBaseEntity {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID identificador;

    @Column(unique=true, nullable=false)
    private long  registro;

    @Column(nullable=false, length = 255)
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorGrupoEscoteiro")
    private GrupoEscoteiroEntity grupoEscoteiro;

    @Column(nullable=false, length = 20)
    private String telefone;

    @Column(nullable=false, length = 20)
    private String celular;
}