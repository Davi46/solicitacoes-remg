package com.regiaoescoteira.solicitacoes.service;

import com.regiaoescoteira.solicitacoes.model.Item;
import com.regiaoescoteira.solicitacoes.model.enums.TipoItemEnum;

import java.util.List;

public interface ItemService {
    /*
     * Método utilizado para buscar todos os itens cadastrado para o  tipo informado
     * @param tipoItem a ser buscado
     * @return Todos os itens cadastrado
     * */
    public List<Item> buscarItens(TipoItemEnum tipoItem) throws Exception;
}
