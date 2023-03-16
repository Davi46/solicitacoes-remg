package com.regiaoescoteira.solicitacoes.service.impl;

import com.regiaoescoteira.solicitacoes.adapter.repository.SolicitacaoRepository;
import com.regiaoescoteira.solicitacoes.adapter.repository.StatusRepository;
import com.regiaoescoteira.solicitacoes.adapter.repository.StatusSolicitacaoRepository;
import com.regiaoescoteira.solicitacoes.model.StatusSolicitacao;
import com.regiaoescoteira.solicitacoes.model.entity.StatusSolicitacaoEntity;
import com.regiaoescoteira.solicitacoes.service.StatusSolicitacaoService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
@Slf4j
public class StatusSolicitacaoServiceImpl implements StatusSolicitacaoService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    @Autowired
    private StatusSolicitacaoRepository statusSolicitacaoRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Long solicitarCondecoracao(StatusSolicitacao statusSolicitacao, UUID identificadorSolicitacao) throws Exception {
        if(statusSolicitacao == null || identificadorSolicitacao == null){
            log.error("Objeto informado é igual a null");
            throw new IllegalArgumentException("Objeto informado não pode ser nulo");
        }
        log.info("Objeto Recebido: ");
        log.info(statusSolicitacao.toString());
        log.info(identificadorSolicitacao.toString());

        var solicitacao = solicitacaoRepository.getByIdentificadorSolicitacao(identificadorSolicitacao);

        //TODO: Criar exceção especifica
        if(solicitacao == null){
            throw new Exception("Solicitação não foi encontrada com o Identificador informado");
        }

        var statusEntity = statusSolicitacaoToModel(statusSolicitacao);

        statusEntity.setSolicitacao(solicitacao);

        var identificado = statusSolicitacaoRepository.save(statusEntity).getIdentificador();

        log.info("Objeto Salvo. Identificador: ");
        log.info(identificado.toString());
        return identificado;
    }

    private StatusSolicitacaoEntity statusSolicitacaoToModel(StatusSolicitacao statusSolicitacao) {
        var statusEntity = new StatusSolicitacaoEntity();
        statusEntity.setCriacao(OffsetDateTime.now());
        statusEntity.setObservacao(statusSolicitacao.getObservacao());
        statusEntity.setStatus(statusRepository.getById(statusSolicitacao.getStatusEnum().getValue()));
        return  statusEntity;
    }
}