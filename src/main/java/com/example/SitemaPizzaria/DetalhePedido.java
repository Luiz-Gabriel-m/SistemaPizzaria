package com.example.SitemaPizzaria;


import jakarta.persistence.*;

@Entity
@Table(name = "Detalhe_Dos_Pedidos" )
public class DetalhePedido {

    @Column(name = "Id_Detalhe_Pedido")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_Detalhe_Pedido;

    @Column(name = "Pedido")
    int Pedido;


    @Column(name = "Cliente_Pedido")
    int Cliente_Pedido;



    public int getId_Detalhe_Pedido() {
        return Id_Detalhe_Pedido;
    }


    public void setId_Detalhe_Pedido(int id_Detalhe_Pedido) {
        Id_Detalhe_Pedido = id_Detalhe_Pedido;
    }


    public int getPedido() {
        return Pedido;
    }

    public void setPedido(int pedido) {
        Pedido = pedido;
    }

    public int getCliente_Pedido() {
        return Cliente_Pedido;
    }

    public void setCliente_Pedido(int cliente_Pedido) {
        Cliente_Pedido = cliente_Pedido;
    }
}
