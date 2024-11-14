package com.example.SitemaPizzaria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pizzaria")
public class Controller {

    @Autowired
    PedidosRepository pedidosRepoditory ;
    @GetMapping("/Listarpedidos")
    public List<Pedidos> pedidos (){

       return pedidosRepoditory.findAll();
    }

    @Autowired
    ProdutoRepository produtoRepository;
    @GetMapping("/Listarprodutos")
    public List<Produto> produtos () {

        return produtoRepository.findAll();
    }
    @Autowired
    ClienteRepository clienteRepository;
    @GetMapping("/Listarclientes")
    public List<Pedidos> clientes (){

        return pedidosRepoditory.findAll();
    }

    @Autowired
    DetalhespedidoRepository detalhespedidoRepository;
    @GetMapping("/ListarDetalhespedidos")
    public List<DetalhePedido> Detalhespedido () {

        return detalhespedidoRepository.findAll();
    }


}
