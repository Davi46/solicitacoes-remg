package com.remg.solicitacoes.model.Entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "NivelFormacao")
public class NivelFormacaoEntity extends ItemEntity{
    public NivelFormacaoEntity(){
        super();
    }
}
