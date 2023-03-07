package com.regiaoescoteira.solicitacoes.service;

import com.regiaoescoteira.solicitacoes.model.SolicitacaoCondecoracao;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface SolicitacaoCondecoracaoService {
    /*
    * Método utilizado para criar uma nova solicitação de condecoração.
    * @param solicitacaoCondecoracao objeto utilizado para criar a solicitação
    * @return o identificador da solicitação criada
    * */
    public UUID solicitarCondecoracao(SolicitacaoCondecoracao solicitacaoCondecoracao);

    /*
     * Método utilizado para buscar todas as solicitações de condecorações.
     * @return todas as solicitações de condecorações.
     * */
    public List<SolicitacaoCondecoracao> buscarTodasSolicitacoes();

    /*
     * Método utilizado para buscar uma solicitações especifica.
     * @param Identificador da solicitação
     * @return Solicitação de condecoração encontrada
     * */
    public SolicitacaoCondecoracao buscarSolicitacao(UUID identificador);
}