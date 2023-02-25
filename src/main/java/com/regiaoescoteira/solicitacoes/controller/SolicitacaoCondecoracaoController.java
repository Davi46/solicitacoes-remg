package com.regiaoescoteira.solicitacoes.controller;

import com.regiaoescoteira.solicitacoes.model.SolicitacaoCondecoracao;
import com.regiaoescoteira.solicitacoes.service.SolicitacaoCondecoracaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/solicitacao-condecoracao")
@Slf4j
public class SolicitacaoCondecoracaoController {
    @Autowired
    private SolicitacaoCondecoracaoService solicitacaoCondecoracaoService;

    @PostMapping
    public ResponseEntity<UUID> save(@RequestBody @Validated final SolicitacaoCondecoracao solicitacao) {
        var retorno = solicitacaoCondecoracaoService.solicitarCondecoracao(solicitacao);
        return ResponseEntity.ok(retorno);
    }

    @GetMapping
    public  ResponseEntity<List<SolicitacaoCondecoracao>> getAllSolicitacoes(){
        return ResponseEntity.ok(solicitacaoCondecoracaoService.buscarTodasSolicitacoes());
    }
}
