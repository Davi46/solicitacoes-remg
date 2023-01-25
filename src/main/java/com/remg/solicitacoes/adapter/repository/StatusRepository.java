package com.remg.solicitacoes.adapter.repository;

import com.remg.solicitacoes.Model.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Integer> {
}
