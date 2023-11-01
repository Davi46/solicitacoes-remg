package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.SolicitacaoEntity;
import com.regiaoescoteira.solicitacoes.model.entity.StatusSolicitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StatusSolicitacaoRepository extends JpaRepository<StatusSolicitacaoEntity, UUID> {
    List<StatusSolicitacaoEntity> getStatusSolicitacoesBySolicitacaoOrderByCriacao(SolicitacaoEntity solicitacao);
}