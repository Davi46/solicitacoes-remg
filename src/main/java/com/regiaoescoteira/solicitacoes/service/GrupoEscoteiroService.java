package com.regiaoescoteira.solicitacoes.service;

import com.regiaoescoteira.solicitacoes.model.GrupoEscoteiro;

import java.util.List;

public interface GrupoEscoteiroService {
    /*
     * Método utilizado para buscar todos os grupos escoteiros cadastrado
     * @return Todos os Grupos Escoteiros cadastrado
     * */
    public List<GrupoEscoteiro> buscarGrupos();
}