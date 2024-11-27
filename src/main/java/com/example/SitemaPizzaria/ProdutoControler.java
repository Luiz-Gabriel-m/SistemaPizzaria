package com.example.SitemaPizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pizzaria")
public class ProdutoControler {
    // b
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/Listarprodutos")
    public List<Produto> produtos() {

        return produtoRepository.findAll();
    }
}
