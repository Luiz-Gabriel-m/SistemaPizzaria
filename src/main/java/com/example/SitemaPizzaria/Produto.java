package com.example.SitemaPizzaria;

import jakarta.persistence.*;

@Entity
@Table(name = "Produtos")
public class Produto {

    @Column(name = "Id_Produtos")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_Produtos;

    @Column(name = "Nome_Produto")
    String Nome_Produto;

    @Column(name = "Preco_Produto")
    double Preco_Produto;

    @Column(name = "Categoria")
    String Categoria;

    public int getId_Produtos() {
        return Id_Produtos;
    }

    public void setId_Produtos(int id_Produtos) {
        Id_Produtos = id_Produtos;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public void setNome_Produto(String nome_Produto) {
        Nome_Produto = nome_Produto;
    }

    public double getPreco_Produto() {
        return Preco_Produto;
    }

    public void setPreco_Produto(double preco_Produto) {
        Preco_Produto = preco_Produto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}
