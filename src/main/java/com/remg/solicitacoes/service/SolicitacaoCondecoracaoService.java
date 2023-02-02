package com.remg.solicitacoes.service;

import com.remg.solicitacoes.model.SolicitacaoCondecoracao;

import java.util.UUID;

public interface SolicitacaoCondecoracaoService {
    /*
    * Método utilizado para criar uma nova solicitação de condecoração.
    * @param solicitacaoCondecoracao objeto utilizado para criar a solicitação
    * @return o identificador da solicitação criada
    * */
    public UUID solicitarCondecoracao(SolicitacaoCondecoracao solicitacaoCondecoracao);
}
