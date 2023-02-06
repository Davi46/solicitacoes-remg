package com.regiaoescoteira.solicitacoes.model.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

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
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID identificador;

    @Column(unique=true, nullable=false)
    private int numeroGrupo;

    @Column(nullable=false, length = 255)
    private String nomeGrupo;
}