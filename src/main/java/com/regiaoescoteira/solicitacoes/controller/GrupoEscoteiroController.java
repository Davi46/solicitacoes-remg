package com.regiaoescoteira.solicitacoes.controller;

import com.regiaoescoteira.solicitacoes.model.GrupoEscoteiro;
import com.regiaoescoteira.solicitacoes.service.GrupoEscoteiroService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/grupo-escoteiro")
@Slf4j
public class GrupoEscoteiroController {
    @Autowired
    private GrupoEscoteiroService grupoEscoteiroService;

    @ApiOperation(value = "Método utilizado para buscar todos os grupos escoteiros cadastrado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de grupos escoteiros cadastrados na Região Escoteira.")
    })
    @GetMapping
    public ResponseEntity<List<GrupoEscoteiro>> getAllGrupos(){
        return ResponseEntity.ok(grupoEscoteiroService.buscarGrupos());
    }
}