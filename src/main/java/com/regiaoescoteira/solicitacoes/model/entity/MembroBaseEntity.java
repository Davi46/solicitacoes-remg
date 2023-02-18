package com.regiaoescoteira.solicitacoes.model.entity;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class MembroBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long identificador;

    @Column(unique=true, nullable=false)
    private long  registro;

    @Column(nullable=false, length = 255)
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorGrupoEscoteiro")
    private GrupoEscoteiroEntity grupoEscoteiro; 
}