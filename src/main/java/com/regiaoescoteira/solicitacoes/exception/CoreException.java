package com.regiaoescoteira.solicitacoes.exception;

import com.regiaoescoteira.solicitacoes.exception.error.CoreError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class CoreException extends Exception{
    private String type;
    private Collection<CoreError> errors;

    protected CoreException(String message){
        super(message);
    }

    /*public CoreResponseDto buildCoreResponseDto(){
        return new CoreResponseDto(this.type, this.getMessage(), this.errors);
    }*/
}
