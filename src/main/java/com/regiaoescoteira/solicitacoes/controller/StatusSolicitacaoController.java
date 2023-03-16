package com.regiaoescoteira.solicitacoes.controller;

import com.regiaoescoteira.solicitacoes.model.StatusSolicitacao;
import com.regiaoescoteira.solicitacoes.service.impl.StatusSolicitacaoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/status-solicitacao")
@Slf4j
public class StatusSolicitacaoController {
    @Autowired
    private StatusSolicitacaoServiceImpl statusSolicitacaoServiceImpl;

    @PostMapping(value = "/{identificadorSolicitacao}")
    public ResponseEntity<Long> save(@RequestBody @Validated final StatusSolicitacao statusSolicitacao, @PathVariable UUID identificadorSolicitacao) throws Exception {
        var retorno = statusSolicitacaoServiceImpl.solicitarCondecoracao(statusSolicitacao, identificadorSolicitacao);
        return ResponseEntity.ok(retorno);
    }
}
