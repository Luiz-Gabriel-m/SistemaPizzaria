package com.example.SitemaPizzaria;


import jakarta.persistence.*;

@Entity
@Table(name = "Detalhe_Dos_Pedidos" )
public class DetalhePedido {

    @Column(name = "Id_Detalhe_Pedido")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id_Detalhe_Pedido;

    @ManyToOne
    @JoinColumn(name = "Pedido_id")
    private Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "Produto_id")
    private Produto produto;

    public int getId_Detalhe_Pedido() {
        return Id_Detalhe_Pedido;
    }

    public void setId_Detalhe_Pedido(int id_Detalhe_Pedido) {
        Id_Detalhe_Pedido = id_Detalhe_Pedido;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
