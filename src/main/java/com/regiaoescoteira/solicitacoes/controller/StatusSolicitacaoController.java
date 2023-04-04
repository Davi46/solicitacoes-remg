package com.regiaoescoteira.solicitacoes.controller;

import com.regiaoescoteira.solicitacoes.model.StatusSolicitacao;
import com.regiaoescoteira.solicitacoes.service.StatusSolicitacaoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    private StatusSolicitacaoService statusSolicitacaoServiceImpl;

    @ApiOperation(value = "Método utilizado para criar um novo Status numa Solicitação já existente.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Item criado e retorna o identificador da solicitação criada.")
    })
    @PostMapping(value = "/{identificadorSolicitacao}")
    public ResponseEntity<Long> save(@RequestBody @Validated final StatusSolicitacao statusSolicitacao, @PathVariable UUID identificadorSolicitacao) throws Exception {
        var retorno = statusSolicitacaoServiceImpl.solicitarCondecoracao(statusSolicitacao, identificadorSolicitacao);
        return ResponseEntity.ok(retorno);
    }
}
