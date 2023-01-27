package com.remg.solicitacoes.model.Entity;

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
}