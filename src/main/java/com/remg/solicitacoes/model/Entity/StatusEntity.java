package com.remg.solicitacoes.model.Entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Status")
public class StatusEntity extends ItemEntity{

    public StatusEntity(){
        super();
    }
}