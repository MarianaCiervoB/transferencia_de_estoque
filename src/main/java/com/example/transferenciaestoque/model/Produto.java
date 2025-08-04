package com.example.transferenciaestoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private String lojaAtual; // Nome da loja onde está
}