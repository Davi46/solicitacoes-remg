package com.regiaoescoteira.solicitacoes.model.entity;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long identificador;

    @Column(unique=true, nullable=false, length = 255)
    private String nome;

    @Column(nullable=false, length = 255)
    private String descricao;

    @Column(nullable=false)
    private boolean status;
}