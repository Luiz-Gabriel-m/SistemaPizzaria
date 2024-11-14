package com.example.SitemaPizzaria;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Column(name = "Id_Cliente")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_Cliente;

    @Column(name = "Nome_Cliente")
    String Nome_Cliente;

    @Column(name = "Telefone_Cliente")
    String Telefone_Cliente;

    @Column(name = "Endereco_Cliente")
    String Endereco_Cliente;

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        Id_Cliente = id_Cliente;
    }

    public String getNome_Cliente() {
        return Nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        Nome_Cliente = nome_Cliente;
    }

    public String getTelefone_Cliente() {
        return Telefone_Cliente;
    }

    public void setTelefone_Cliente(String telefone_Cliente) {
        Telefone_Cliente = telefone_Cliente;
    }

    public String getEndereco_Cliente() {
        return Endereco_Cliente;
    }

    public void setEndereco_Cliente(String endereco_Cliente) {
        Endereco_Cliente = endereco_Cliente;
    }
}
