package com.example.SitemaPizzaria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PedidosRepository extends JpaRepository<Pedidos,Integer> {
}
@Repository
interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}

@Repository
interface DetalhespedidoRepository extends JpaRepository<DetalhePedido,Integer> {
}
