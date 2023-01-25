package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Table(name = "Condecoracao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class CondecoracaoEntity extends ItemEntity{
    public CondecoracaoEntity(){
        super();
    }
}
