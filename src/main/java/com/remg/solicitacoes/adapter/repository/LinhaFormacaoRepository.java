package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.LinhaFormacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaFormacaoRepository extends JpaRepository<LinhaFormacaoEntity, Long> {
}