package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.SolicitacaoNivelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface SolicitacaoNivelRepository  extends JpaRepository<SolicitacaoNivelEntity, UUID> {
}