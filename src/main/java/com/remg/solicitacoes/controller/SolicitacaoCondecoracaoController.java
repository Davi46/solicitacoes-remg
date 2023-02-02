package com.remg.solicitacoes.controller;

import com.remg.solicitacoes.model.SolicitacaoCondecoracao;
import com.remg.solicitacoes.service.SolicitacaoCondecoracaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/solicitacao-condecoracao")
@Slf4j
public class SolicitacaoCondecoracaoController {
    @Autowired
    private SolicitacaoCondecoracaoService solicitacaoCondecoracaoService;

    @PostMapping
    public ResponseEntity<UUID> save(@RequestBody @Validated final SolicitacaoCondecoracao solicitacao){
        var retorno = solicitacaoCondecoracaoService.solicitarCondecoracao(solicitacao);
        return ResponseEntity.ok(retorno);
    }
}
