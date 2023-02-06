package com.regiaoescoteira.solicitacoes.service.impl;

import com.regiaoescoteira.solicitacoes.adapter.repository.*;
import com.regiaoescoteira.solicitacoes.model.SolicitacaoCondecoracao;
import com.regiaoescoteira.solicitacoes.model.entity.SolicitacaoCondecoracaoEntity;
import com.regiaoescoteira.solicitacoes.service.SolicitacaoCondecoracaoService;
import com.remg.solicitacoes.adapter.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class SolicitacaoCondecoracaoServiceImpl implements SolicitacaoCondecoracaoService {
    @Autowired
    private SolicitacaoCondecoracaoRepository solicitacaoCondecoracaoRepository;

    @Autowired
    private StatusRepository statusRepository ;

    @Autowired
    private TipoSolicitacaoRepository tipoSolicitacaoRepository;

    @Autowired
    private CondecoracaoRepository condecoracaoRepository;

    @Autowired
    private GrupoEscoteiroRepository grupoEscoteiroRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UUID solicitarCondecoracao(SolicitacaoCondecoracao solicitacaoCondecoracao) {

        if(solicitacaoCondecoracao == null){
            log.error("Objeto informado é igual a null");
            throw new IllegalArgumentException("Objeto informado não pode ser nulo");
        }
        log.info("Objeto Recebido: ");
        log.info(solicitacaoCondecoracao.toString());

        var entity = solicitacaoCondecoracaoToEntity(solicitacaoCondecoracao);
        entity.getSolicitacao().setStatus(statusRepository.getReferenceById(1L));
        entity.getSolicitacao().setTipoSolicitacao(tipoSolicitacaoRepository.getReferenceById(3L));
        entity.setCondecoracao(condecoracaoRepository.getReferenceById(solicitacaoCondecoracao.getCondecoracao().getIdentificador()));
        entity.getAgraciado().setGrupoEscoteiro(grupoEscoteiroRepository.getByNumeroGrupo(solicitacaoCondecoracao.getAgraciado().getGrupoEscoteiro().getNumeroGrupo()));
        entity.getSolicitante().setGrupoEscoteiro(grupoEscoteiroRepository.getByNumeroGrupo(solicitacaoCondecoracao.getSolicitante().getGrupoEscoteiro().getNumeroGrupo()));

        var retorno = solicitacaoCondecoracaoRepository.save(entity);

        log.info("Objeto Salvo com Sucesso. Identificador: ");
        log.info(retorno.getIdentificador().toString());
        return retorno.getIdentificador();
    }

    private SolicitacaoCondecoracaoEntity solicitacaoCondecoracaoToEntity(SolicitacaoCondecoracao solicitacaoCondecoracao) {
        return modelMapper.map(solicitacaoCondecoracao, SolicitacaoCondecoracaoEntity.class);
    }


}