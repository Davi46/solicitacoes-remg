package com.regiaoescoteira.solicitacoes.service;

import com.regiaoescoteira.solicitacoes.model.StatusSolicitacao;
import java.util.UUID;

public interface StatusSolicitacaoService {
    /*
     * Método utilizado para criar um novo Status numa Solicitação já existente
     * @param statusSolicitacao objeto utilizado para criar um novo status
     * @param identificadorSolicitacao identificador da solicitação
     * @return o identificador do status criada
     * */
    Long solicitarCondecoracao(StatusSolicitacao statusSolicitacao, UUID identificadorSolicitacao) throws Exception;
}