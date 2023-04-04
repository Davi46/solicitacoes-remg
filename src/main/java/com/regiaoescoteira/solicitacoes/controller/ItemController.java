package com.regiaoescoteira.solicitacoes.controller;

import com.regiaoescoteira.solicitacoes.model.Item;



import com.regiaoescoteira.solicitacoes.model.enums.TipoItemEnum;
import com.regiaoescoteira.solicitacoes.service.ItemService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item")
@Slf4j
public class ItemController {
    @Autowired
    private ItemService itemServiceImpl;

    @ApiOperation(value = "Método utilizado para buscar todos os itens cadastrado para o  tipo informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Todos os itens cadastrado para o tipo de item informado.")
    })
    @GetMapping
    public  ResponseEntity<List<Item>> getAllSolicitacoes(TipoItemEnum tipoItemEnum) throws Exception {
        return ResponseEntity.ok(itemServiceImpl.buscarItens(tipoItemEnum));
    }
}
