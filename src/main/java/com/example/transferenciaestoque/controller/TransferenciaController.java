package com.example.transferenciaestoque.controller;

import com.example.transferenciaestoque.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @PostMapping("/{produtoId}")
    public String transferir(@PathVariable Long produtoId, @RequestParam String novaLoja) {
        return transferenciaService.transferirProduto(produtoId, novaLoja);
    }
}