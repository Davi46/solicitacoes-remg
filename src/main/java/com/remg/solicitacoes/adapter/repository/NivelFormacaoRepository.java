package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.NivelFormacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelFormacaoRepository extends JpaRepository<NivelFormacaoEntity, Long> {
}