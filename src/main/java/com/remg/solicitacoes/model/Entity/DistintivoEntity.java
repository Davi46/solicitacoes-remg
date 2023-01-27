package com.remg.solicitacoes.model.Entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Table(name = "Distintivo")
@Entity
public class DistintivoEntity extends ItemEntity{
    public DistintivoEntity(){
        super();
    }
}