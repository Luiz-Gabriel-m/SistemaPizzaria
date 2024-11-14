package com.example.SitemaPizzaria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetalhespedidoRepository extends JpaRepository<DetalhePedido, Integer> {
}
