package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.AgraciadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AgraciadoRepository extends JpaRepository<AgraciadoEntity, UUID> {
    public AgraciadoEntity getByRegistro(long registro);
}