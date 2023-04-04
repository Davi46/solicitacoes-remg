package com.regiaoescoteira.solicitacoes.controller;

import com.regiaoescoteira.solicitacoes.model.SolicitacaoCondecoracao;
import com.regiaoescoteira.solicitacoes.service.SolicitacaoCondecoracaoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/solicitacao-condecoracao")
@Slf4j
public class SolicitacaoCondecoracaoController {
    @Autowired
    private SolicitacaoCondecoracaoService solicitacaoCondecoracaoService;

    @ApiOperation(value = " Método utilizado para criar uma nova solicitação de condecoração.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Item criado e retorna o identificador da solicitação criada.")
    })
    @PostMapping
    public ResponseEntity<UUID> save(@RequestBody final SolicitacaoCondecoracao solicitacao) {
        var retorno = solicitacaoCondecoracaoService.solicitarCondecoracao(solicitacao);
        return ResponseEntity.ok(retorno);
    }

    @ApiOperation(value = "Método utilizado para buscar todas as solicitações de condecorações.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna todas as solicitações de condecorações.")
    })
    @GetMapping
    public  ResponseEntity<List<SolicitacaoCondecoracao>> getAllSolicitacoes(){
        return ResponseEntity.ok(solicitacaoCondecoracaoService.buscarTodasSolicitacoes());
    }

    @ApiOperation(value = " Método utilizado para buscar uma solicitações especifica.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Solicitação de condecoração encontrada")
    })
    @GetMapping(value = "/{identificador}")
    public  ResponseEntity<SolicitacaoCondecoracao> getSolicitacao(@PathVariable UUID identificador){
        return ResponseEntity.ok(solicitacaoCondecoracaoService.buscarSolicitacao(identificador));
    }
}