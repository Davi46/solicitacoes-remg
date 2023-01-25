package Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor@Entity
@Table(name = "AssessorPessoalFormacao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class AssessorPessoalFormacaoEntity extends MembroBaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorLinhaFormacao")
    private LinhaFormacaoEntity linhaFormacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorNivelFormacao")
    private NivelFormacaoEntity nivelFormacao;
}