package com.regiaoescoteira.solicitacoes.service.impl;

import com.regiaoescoteira.solicitacoes.adapter.repository.*;
import com.regiaoescoteira.solicitacoes.model.Item; 
import com.regiaoescoteira.solicitacoes.model.entity.*;
import com.regiaoescoteira.solicitacoes.model.enums.TipoItemEnum;
import com.regiaoescoteira.solicitacoes.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TipoSolicitacaoRepository tipoSolicitacaoRepository;

    @Autowired
    private CondecoracaoRepository condecoracaoRepository;

    @Autowired
    private StatusSolicitacaoRepository statusSolicitacaoRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Item> buscarItens(TipoItemEnum tipoItem) throws Exception {
        if(tipoItem == null){
            log.error("Objeto informado é igual a null");
            throw new IllegalArgumentException("Objeto informado não pode ser nulo");
        }
        log.info("Objeto Recebido: ");
        log.info(tipoItem.toString());

        List<Item> itens = null;
        switch (tipoItem){
            case STATUS -> {
                itens =  buscarStatus();
            }
            case TIPO_SOLICITACAO -> {
                itens = buscarTipoSolicitacoes();
            }
            case TIPO_CONDECORACAO -> {
                itens = buscarTiposCondecoracao();
            }
            default -> throw new Exception("Tipo informado não existe");
        }

        log.info("Objeto recuperado: ");
        log.info(itens.toString());

        return itens;
    }

    private List<Item> buscarStatus() {
        return statusEntityToModel(statusRepository.findAll());
    }

    private List<Item> buscarTipoSolicitacoes() {
        return tipoSolicitacaoToModel(tipoSolicitacaoRepository.findAll());
    }

    private List<Item> buscarTiposCondecoracao() {
        return tipoCondecoracaoToModel(condecoracaoRepository.findAll());
    }

    private List<Item> tipoCondecoracaoToModel(List<CondecoracaoEntity> all) {
        List<Item> itens = new ArrayList<>();

        all.forEach(p -> itens.add(modelMapper.map(p, Item.class)));
        return  itens;
    }

    private List<Item> statusEntityToModel(List<StatusEntity> all) {
        List<Item> itens = new ArrayList<>();

        all.forEach(p -> itens.add(modelMapper.map(p, Item.class)));
        return  itens;
    }

    private List<Item> tipoSolicitacaoToModel(List<TipoSolicitacaoEntity> all) {
        List<Item> itens = new ArrayList<>();

        all.forEach(p -> itens.add(modelMapper.map(p, Item.class)));
        return  itens;
    }
}