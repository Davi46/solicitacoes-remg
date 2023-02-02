package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.TipoSolicitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSolicitacaoRepository extends JpaRepository<TipoSolicitacaoEntity, Long> {
}
