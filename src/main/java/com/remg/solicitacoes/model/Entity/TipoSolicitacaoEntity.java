package com.remg.solicitacoes.model.Entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TipoSolicitacao")
public class TipoSolicitacaoEntity extends ItemEntity{
    public TipoSolicitacaoEntity(){
        super();
    }
}