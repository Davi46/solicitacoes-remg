package com.regiaoescoteira.solicitacoes.model.entity;

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
