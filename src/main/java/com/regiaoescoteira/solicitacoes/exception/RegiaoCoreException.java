package com.regiaoescoteira.solicitacoes.exception;

import com.regiaoescoteira.solicitacoes.exception.error.CoreError;
import lombok.Setter;

import java.util.ArrayList;

@Setter
public class RegiaoCoreException extends CoreException{
    protected RegiaoCoreException(){
        super();
    }

    protected RegiaoCoreException(String message){
        super(message);
    }

    public void addError(CoreError coreError){
        if(getErrors() == null){
            setErrors(new ArrayList<>());
        }

        getErrors().add(coreError);
   }
}