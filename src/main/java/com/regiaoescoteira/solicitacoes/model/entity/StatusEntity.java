package com.regiaoescoteira.solicitacoes.model.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Status")
public class StatusEntity extends ItemEntity{
   public StatusEntity(){
        super();
    }
}