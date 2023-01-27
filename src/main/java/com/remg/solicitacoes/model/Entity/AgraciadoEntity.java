package com.remg.solicitacoes.model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Agraciado")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class AgraciadoEntity extends MembroBaseEntity{

    public AgraciadoEntity(){
        super();
    }
}