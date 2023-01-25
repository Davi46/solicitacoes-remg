package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "NivelFormacao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class NivelFormacaoEntity extends ItemEntity{
    public NivelFormacaoEntity(){
        super();
    }
}
