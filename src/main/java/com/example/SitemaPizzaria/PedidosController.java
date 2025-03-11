package com.example.SitemaPizzaria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pizzaria")
public class PedidosController {

    @Autowired
    PedidosRepository pedidosRepoditory ;
    @GetMapping("/Listarpedidos")
    public List<Pedidos> pedidos (){

       return pedidosRepoditory.findAll();
    }
}
