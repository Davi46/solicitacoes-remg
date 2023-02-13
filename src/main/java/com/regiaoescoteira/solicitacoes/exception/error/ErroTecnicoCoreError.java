package com.regiaoescoteira.solicitacoes.exception.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErroTecnicoCoreError extends CoreError{
    public ErroTecnicoCoreError(String message){
        super("ErroTecnicoCoreError", message);
    }
}