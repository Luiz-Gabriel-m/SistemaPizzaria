package com.example.SitemaPizzaria;

import jakarta.persistence.*; // Importa as anotações JPA.

@Entity
@Table(name = "Produtos") // Define a entidade como uma tabela chamada "Produtos" no banco de dados.
public class Produto {

    @Column(name = "Id_Produtos") // Mapeia a coluna "Id_Produtos" da tabela.
    @Id // Indica que este campo é a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor do ID é gerado automaticamente.
    int IdProdutos; // Campo que armazena o ID do produto.

    @Column(name = "Nome_Produto") // Mapeia a coluna "Nome_Produto" da tabela.
    String NomeProduto; // Campo que armazena o nome do produto.

    @Column(name = "Preco_Produto") // Mapeia a coluna "Preco_Produto" da tabela.
    double PrecoProduto; // Campo que armazena o preço do produto.

    @Column(name = "Categoria") // Mapeia a coluna "Categoria" da tabela.
    String Categoria; // Campo que armazena a categoria do produto.

    public Integer getIdProdutos() { // Método getter para o ID do produto.
        return IdProdutos;
    }

    public void setIdProdutos(int idProdutos) { // Método setter para o ID do produto.
        IdProdutos = idProdutos;
    }

    public String getNomeProduto() { // Método getter para o nome do produto.
        return NomeProduto;
    }

    public void setNomeProduto(String nomeProduto) { // Método setter para o nome do produto.
        NomeProduto = nomeProduto;
    }

    public double getPrecoProduto() { // Método getter para o preço do produto.
        return PrecoProduto;
    }

    public void setPrecoProduto(double precoProduto) { // Método setter para o preço do produto.
        PrecoProduto = precoProduto;
    }

    public String getCategoria() { // Método getter para a categoria do produto.
        return Categoria;
    }

    public void setCategoria(String categoria) { // Método setter para a categoria do produto.
        Categoria = categoria;
    }
}
