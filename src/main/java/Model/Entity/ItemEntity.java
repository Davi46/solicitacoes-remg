package Model.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int identificador;

    @Column(unique=true, nullable=false, length = 255)
    private String nome;

    @Column(nullable=false)
    private boolean status;
}
