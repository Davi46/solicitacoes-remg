package Model.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TipoSolicitacao")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "identificador")
public class TipoSolicitacaoEntity extends ItemEntity{
}