package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.model.Entity.GrupoEscoteiroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface GrupoEscoteiroRepository extends JpaRepository<GrupoEscoteiroEntity, UUID> {

    GrupoEscoteiroEntity getByNumeroGrupo(int numeroGrupo);
}