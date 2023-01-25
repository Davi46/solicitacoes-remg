package Model.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MembroBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID identificador;

    @Column(unique=true, nullable=false)
    private int registro;

    @Column(nullable=false, length = 255)
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificadorGrupoEscoteiro")
    private GrupoEscoteiroEntity grupoEscoteiro;

    @Column(nullable=false, length = 20)
    private String telefone;

    @Column(nullable=false, length = 20)
    private String celular;
}