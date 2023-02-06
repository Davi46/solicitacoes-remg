package com.regiaoescoteira.solicitacoes.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErroTecnicoCoreError extends CoreError{
    public ErroTecnicoCoreError(String message){
        super("ErroTecnicoCoreError", message);
    }
}