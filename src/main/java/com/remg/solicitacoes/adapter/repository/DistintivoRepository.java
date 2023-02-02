package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.DistintivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistintivoRepository extends JpaRepository<DistintivoEntity, Long> {
}