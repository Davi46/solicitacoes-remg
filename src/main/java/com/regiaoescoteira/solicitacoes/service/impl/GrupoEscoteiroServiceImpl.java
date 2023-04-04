package com.regiaoescoteira.solicitacoes.service.impl;

import com.regiaoescoteira.solicitacoes.adapter.repository.GrupoEscoteiroRepository;
import com.regiaoescoteira.solicitacoes.model.GrupoEscoteiro;
import com.regiaoescoteira.solicitacoes.service.GrupoEscoteiroService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GrupoEscoteiroServiceImpl implements GrupoEscoteiroService {
    @Autowired
    private GrupoEscoteiroRepository grupoEscoteiroRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<GrupoEscoteiro> buscarGrupos() {
        List<GrupoEscoteiro> itens = new ArrayList<>();
        grupoEscoteiroRepository.findAll().forEach(p -> itens.add(modelMapper.map(p, GrupoEscoteiro.class)));

        log.info("Objeto recuperado: ");
        log.info(itens.toString());

        return itens;
    }
}
