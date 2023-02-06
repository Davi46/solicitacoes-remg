package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.NivelFormacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelFormacaoRepository extends JpaRepository<NivelFormacaoEntity, Long> {
}