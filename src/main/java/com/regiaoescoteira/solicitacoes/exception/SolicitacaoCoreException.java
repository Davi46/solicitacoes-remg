package com.regiaoescoteira.solicitacoes.exception;

import com.regiaoescoteira.solicitacoes.exception.error.SolicitacaoCoreError;

public class SolicitacaoCoreException extends RegiaoCoreException{

    public SolicitacaoCoreException(){
        super();
        super.setType("SolicitacaoCoreException");
    }

    public SolicitacaoCoreException(SolicitacaoCoreError error){
        super();
        super.setType("SolicitacaoCoreException");
        super.addError(error);
    }
}