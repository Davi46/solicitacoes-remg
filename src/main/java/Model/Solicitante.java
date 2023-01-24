package Model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Solicitante extends Membro{
    private String telefone;
    private String celular;
    private String funcao;
}