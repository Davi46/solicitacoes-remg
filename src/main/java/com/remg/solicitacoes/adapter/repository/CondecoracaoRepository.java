package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.CondecoracaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondecoracaoRepository extends JpaRepository<CondecoracaoEntity, Long> {
}