package com.regiaoescoteira.solicitacoes.model.dto;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoreResponseDto {
    private String type;
    private String message;
    private Collection<?> errors;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}