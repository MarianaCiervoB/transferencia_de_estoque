package com.example.transferenciaestoque.repository;

import com.example.transferenciaestoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}