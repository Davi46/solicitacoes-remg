package com.regiaoescoteira.solicitacoes.model.entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Solicitante")
public class SolicitanteEntity extends MembroBaseEntity{
    @Column(nullable=false, length = 255)
    private String funcao;

    @Column(length = 20)
    private String telefone;

    @Column(nullable=false, length = 20)
    private String celular;
}