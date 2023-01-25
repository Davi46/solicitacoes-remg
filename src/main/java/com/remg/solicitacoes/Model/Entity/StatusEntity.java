package com.remg.solicitacoes.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "Status")
public class StatusEntity implements Serializable {/*extends ItemEntity{
    public StatusEntity(){
        super();
    }*/

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int identificador;

    @Column(unique=true, nullable=false, length = 255)
    private String nome;

    @Column(nullable=false)
    private boolean status;
}