package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.SolicitacaoDistintivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SolicitacaoDistintivoRepository extends JpaRepository<SolicitacaoDistintivoEntity, UUID> {

}