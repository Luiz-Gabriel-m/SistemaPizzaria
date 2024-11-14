package com.example.SitemaPizzaria;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pedidos")
public class Pedidos {

    @Column(name = "Id_Pedido")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_Pedido;

    @Column(name = "Produtos_Pedidos")
    int Produtos_Pedidos;

    @Column(name = "Forma_De_Pagamento")
    String Forma_De_Pagamento;

    @Column(name = "Data_E_Hora_Pedido")
    LocalDateTime Data_E_Hora_Pedido;

    public int getId_Pedido() {
        return Id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        Id_Pedido = id_Pedido;
    }

    public int getProdutos_Pedidos() {
        return Produtos_Pedidos;
    }

    public void setProdutos_Pedidos(int produtos_Pedidos) {
        Produtos_Pedidos = produtos_Pedidos;
    }

    public String getForma_De_Pagamento() {
        return Forma_De_Pagamento;
    }

    public void setForma_De_Pagamento(String forma_De_Pagamento) {
        Forma_De_Pagamento = forma_De_Pagamento;
    }

    public LocalDateTime getData_E_Hora_Pedido() {
        return Data_E_Hora_Pedido;
    }

    public void setData_E_Hora_Pedido(LocalDateTime data_E_Hora_Pedido) {
        Data_E_Hora_Pedido = data_E_Hora_Pedido;
    }
}
