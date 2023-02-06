package com.regiaoescoteira.solicitacoes.model.entity;

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