package com.example.SitemaPizzaria;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes") // Define a entidade como uma tabela chamada "Clientes" no banco de dados.
public class Cliente {

    @Column(name = "Id_Cliente") // Mapeia a coluna "Id_Cliente" da tabela.
    @Id // Indica que este campo é a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor do ID é gerado automaticamente.
    int IdCliente; // Campo que armazena o ID do cliente.

    @Column(name = "Nome_Cliente") // Mapeia a coluna "Nome_Cliente" da tabela.
    String NomeCliente; // Campo que armazena o nome do cliente.

    @Column(name = "Telefone_Cliente") // Mapeia a coluna "Telefone_Cliente" da tabela.
    String TelefoneCliente; // Campo que armazena o telefone do cliente.

    @Column(name = "Endereco_Cliente") // Mapeia a coluna "Endereco_Cliente" da tabela.
    String EnderecoCliente; // Campo que armazena o endereço do cliente.

    public Integer getIdCliente() { // Método getter para o ID do cliente.
        return IdCliente;
    }

    public void setIdCliente(int idCliente) { // Método setter para o ID do cliente.
        IdCliente = idCliente;
    }

    public String getNomeCliente() { // Método getter para o nome do cliente.
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) { // Método setter para o nome do cliente.
        NomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() { // Método getter para o telefone do cliente.
        return TelefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) { // Método setter para o telefone do cliente.
        TelefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() { // Método getter para o endereço do cliente.
        return EnderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) { // Método setter para o endereço do cliente.
        EnderecoCliente = enderecoCliente;
    }
}

