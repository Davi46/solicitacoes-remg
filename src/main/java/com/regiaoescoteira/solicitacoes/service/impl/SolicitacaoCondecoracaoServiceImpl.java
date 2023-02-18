package com.regiaoescoteira.solicitacoes.service.impl;

import com.regiaoescoteira.solicitacoes.adapter.repository.*;
import com.regiaoescoteira.solicitacoes.model.SolicitacaoCondecoracao;
import com.regiaoescoteira.solicitacoes.model.entity.AgraciadoEntity;
import com.regiaoescoteira.solicitacoes.model.entity.SolicitacaoCondecoracaoEntity;
import com.regiaoescoteira.solicitacoes.model.entity.SolicitanteEntity;
import com.regiaoescoteira.solicitacoes.model.entity.StatusSolicitacaoEntity;
import com.regiaoescoteira.solicitacoes.model.enums.StatusEnum;
import com.regiaoescoteira.solicitacoes.service.SolicitacaoCondecoracaoService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
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
    private AgraciadoRepository agraciadoRepository;

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    @Autowired
    private StatusSolicitacaoRepository statusSolicitacaoRepository;

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

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
        entity.getSolicitacao().setTipoSolicitacao(tipoSolicitacaoRepository.getReferenceById(3L));
        entity.getSolicitacao().setIdentificadorSolicitacao(UUID.randomUUID());
        entity.setCondecoracao(condecoracaoRepository.getReferenceById(solicitacaoCondecoracao.getCondecoracao().getIdentificador()));
        entity.getAgraciado().setGrupoEscoteiro(grupoEscoteiroRepository.getByNumeroGrupo(solicitacaoCondecoracao.getAgraciado().getGrupoEscoteiro().getNumeroGrupo()));
        entity.getSolicitante().setGrupoEscoteiro(grupoEscoteiroRepository.getByNumeroGrupo(solicitacaoCondecoracao.getSolicitante().getGrupoEscoteiro().getNumeroGrupo()));
        entity.getSolicitacao().setCriacao(OffsetDateTime.now());
        entity.setAgraciado(salvarAgraciado(entity.getAgraciado()));
        entity.setSolicitante(salvarSolicitante(entity.getSolicitante()));
        var retorno = solicitacaoCondecoracaoRepository.save(entity);
        salvarStatusSolicitacao(entity);
        log.info("Objeto Salvo com Sucesso. Identificador: ");
        log.info(retorno.getIdentificador().toString());
        return retorno.getSolicitacao().getIdentificadorSolicitacao();

    }

    private AgraciadoEntity salvarAgraciado(AgraciadoEntity agraciado) {
        var agraciadoConsulta = agraciadoRepository.getByRegistro(agraciado.getRegistro());
        if(agraciadoConsulta == null){
            agraciadoConsulta = agraciadoRepository.save(agraciado);
        }

        return agraciadoConsulta;
    }

    private SolicitanteEntity salvarSolicitante(SolicitanteEntity solicitante) {
        var solicitanteConsulta = solicitanteRepository.getByRegistro(solicitante.getRegistro());
        if(solicitanteConsulta == null){
            solicitanteConsulta = solicitanteRepository.save(solicitante);
        }

        return solicitanteConsulta;
    }

    private void salvarStatusSolicitacao(SolicitacaoCondecoracaoEntity solicitacao) {
        var statusSolicitacao = new StatusSolicitacaoEntity();
        statusSolicitacao.setCriacao(OffsetDateTime.now());
        statusSolicitacao.setStatus(statusRepository.getReferenceById(StatusEnum.RECEBIDA.getValue()));
        statusSolicitacao.setSolicitacao(solicitacao.getSolicitacao());
        statusSolicitacaoRepository.save(statusSolicitacao);
    }

    private Collection<StatusSolicitacaoEntity> getStatusSolicitacao() {
        var statusSolicitacao= new ArrayList<StatusSolicitacaoEntity>();
        var status = new StatusSolicitacaoEntity();
        status.setCriacao(OffsetDateTime.now());
        status.setStatus(statusRepository.getReferenceById(StatusEnum.RECEBIDA.getValue()));

        statusSolicitacao.add(status);
        return statusSolicitacao;
    }

    private SolicitacaoCondecoracaoEntity solicitacaoCondecoracaoToEntity(SolicitacaoCondecoracao solicitacaoCondecoracao) {
        return modelMapper.map(solicitacaoCondecoracao, SolicitacaoCondecoracaoEntity.class);
    }


}