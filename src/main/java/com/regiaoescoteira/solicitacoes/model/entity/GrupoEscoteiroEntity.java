package com.regiaoescoteira.solicitacoes.model.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GrupoEscoteiro")
public class GrupoEscoteiroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long identificador;

    @Column(unique=true, nullable=false)
    private int numeroGrupo;

    @Column(nullable=false, length = 255)
    private String nomeGrupo;
}