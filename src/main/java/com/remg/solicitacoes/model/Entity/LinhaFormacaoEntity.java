package com.remg.solicitacoes.model.Entity;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "LinhaFormacao")
public class LinhaFormacaoEntity extends ItemEntity{
     public LinhaFormacaoEntity(){
         super();
     }
}