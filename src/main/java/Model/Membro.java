package Model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Membro {
    private int registro;
    private String nome;
    private GrupoEscoteiro grupoEscoteiro;
}