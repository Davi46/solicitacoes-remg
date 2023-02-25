package com.regiaoescoteira.solicitacoes.adapter.repository;

import com.regiaoescoteira.solicitacoes.model.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Long> {

    @Query(value = "Select * from status where identificador = ?", nativeQuery = true)
    StatusEntity getById(Long identificador);
}