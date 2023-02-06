package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.AssessorPessoalFormacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssessorPessoalFormacaoRepository extends JpaRepository<AssessorPessoalFormacaoEntity, UUID> {
}