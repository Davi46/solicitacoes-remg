package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "LinhaFormacao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class LinhaFormacaoEntity extends ItemEntity{
     public LinhaFormacaoEntity(){
         super();
     }
}