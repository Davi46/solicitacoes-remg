package com.regiaoescoteira.solicitacoes.exception;

import com.regiaoescoteira.solicitacoes.exception.error.ModelValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
public class ModelValidationException  extends  Exception{

    private  String type;

    private Collection<ModelValidationError> errors;

    public ModelValidationException(){
        super("Ocorreu um erro de negócio, verifique a propriedade 'errors' para obter mais detalhes.");
        this.type = "ModelValidationException";
    }

    public void addError(ModelValidationError error){
        if(this.errors == null){
            errors = new ArrayList<>();
        }

        this.errors.add(error);
    }
}