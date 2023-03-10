package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.SolicitacaoCondecoracaoEntity;
import com.regiaoescoteira.solicitacoes.model.entity.SolicitacaoEntity;
import com.regiaoescoteira.solicitacoes.model.entity.SolicitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface SolicitacaoCondecoracaoRepository extends JpaRepository<SolicitacaoCondecoracaoEntity, UUID> {
    SolicitacaoCondecoracaoEntity getSolicitacaoCondecoracaoBySolicitacao(SolicitacaoEntity solicitacao);
}