package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GrupoEscoteiro")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class GrupoEscoteiroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID identificador;

    @Column(unique=true, nullable=false)
    private int numeroGrupo;

    @Column(nullable=false, length = 255)
    private String nomeGrupo;
}