package com.remg.solicitacoes.model.Entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Table(name = "Condecoracao")
@Entity
public class CondecoracaoEntity extends ItemEntity{
    public CondecoracaoEntity(){
        super();
    }
}