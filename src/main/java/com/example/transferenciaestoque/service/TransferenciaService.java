package com.example.transferenciaestoque.service;

import com.example.transferenciaestoque.model.Produto;
import com.example.transferenciaestoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public String transferirProduto(Long produtoId, String novaLoja) {
        Produto produto = produtoRepository.findById(produtoId).orElseThrow();
        String lojaAnterior = produto.getLojaAtual();
        produto.setLojaAtual(novaLoja);
        produtoRepository.save(produto);
        return "Produto " + produto.getNome() + " transferido de " + lojaAnterior + " para " + novaLoja;
    }
}