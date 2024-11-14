package com.example.SitemaPizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pizzaria")
public class DetalhePedidoController {

    @Autowired
    DetalhespedidoRepository detalhespedidoRepository;

    @GetMapping("/ListarDetalhespedidos")
    public List<DetalhePedido> Detalhespedido() {

        return detalhespedidoRepository.findAll();
    }

}
