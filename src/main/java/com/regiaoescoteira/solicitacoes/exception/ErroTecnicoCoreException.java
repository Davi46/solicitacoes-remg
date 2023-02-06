package com.regiaoescoteira.solicitacoes.exception;

import com.regiaoescoteira.solicitacoes.exception.error.ErroTecnicoCoreError;

public class ErroTecnicoCoreException extends RegiaoCoreException{

    public ErroTecnicoCoreException(){
        super("Ocorreu um erro de técnico, verifique a propriedade 'errors' para obter mais detalhes.");
        super.setType("ErroTecnicoCoreException");
    }

    public ErroTecnicoCoreException(ErroTecnicoCoreError error){
        super("Ocorreu um erro de técnico, verifique a propriedade 'errors' para obter mais detalhes.");
        super.setType("ErroTecnicoCoreException");
        super.addError(error);
    }
}
