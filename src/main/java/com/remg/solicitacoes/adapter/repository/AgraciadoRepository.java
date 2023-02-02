package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.AgraciadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AgraciadoRepository extends JpaRepository<AgraciadoEntity, UUID> {
}