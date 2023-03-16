package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.SolicitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {

    SolicitacaoEntity getByIdentificadorSolicitacao(UUID identificadorSolicitacao);
}
