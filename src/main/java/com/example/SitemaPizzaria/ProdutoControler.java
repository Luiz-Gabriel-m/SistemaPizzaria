package com.example.SitemaPizzaria;

import org.springframework.beans.factory.annotation.Autowired; // Importa a anotação para injeção de dependência.
import org.springframework.http.HttpStatus; // Importa a classe HttpStatus para manipulação de códigos de status HTTP.
import org.springframework.http.ResponseEntity; // Importa a classe ResponseEntity para manipulação de respostas HTTP.
import org.springframework.web.bind.annotation.*; // Importa as anotações para criar endpoints REST.

import java.util.List; // Importa a classe List para trabalhar com listas.

@RestController // Indica que esta classe é um controlador REST.
@RequestMapping("Pizzaria") // Define a rota base para os endpoints desta classe.
public class ProdutoControler {

    @Autowired // Injeção de dependência do repositório de produtos.
    ProdutoRepository produtoRepository; // Repositório para operações CRUD na entidade Produto.
    @CrossOrigin(origins = "*")

    // Busca todos os produtos cadastrados
    @GetMapping("/Listarprodutos") // Define um endpoint GET para listar todos os produtos.
    public List<Produto> produtos() {
        return produtoRepository.findAll(); // Utiliza o método findAll() do repositório para buscar todos os produtos.
    }

    // Cadastra um novo produto
    @CrossOrigin(origins = "*")
    @PostMapping("/cadastrarProduto") // Define um endpoint POST para cadastrar um novo produto.
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) { // Recebe um objeto Produto no corpo da requisição.
        Produto produtoSalvo = produtoRepository.save(produto); // Salva o produto recebido no banco de dados.
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo); // Retorna uma resposta HTTP com status 201 (CREATED) e o produto salvo no corpo.
    }

    // Atualiza um produto existente
    @CrossOrigin(origins = "*")
    @PutMapping("/atualizarProduto/{id}") // Define um endpoint PUT para atualizar um produto existente.
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Integer id, @RequestBody Produto produto) { // Recebe o ID e o objeto atualizado.
        // Busca o produto pelo ID
        if (produtoRepository.existsById(id)) { // Verifica se o produto existe.
            produto.setIdProdutos(id); // Garante que o ID do produto a ser atualizado seja o mesmo do ID da URL.
            Produto produtoAtualizado = produtoRepository.save(produto); // Atualiza os dados e salva no banco de dados.
            return ResponseEntity.ok(produtoAtualizado); // Retorna uma resposta HTTP com status 200 (OK) e o produto atualizado no corpo.
        } else {
            return ResponseEntity.notFound().build(); // Se o produto não existe, retorna uma resposta HTTP com status 404 (Not Found).
        }
    }

    // Deleta um produto existente
    @CrossOrigin(origins = "*")
    @DeleteMapping("/deletarProduto/{id}") // Define um endpoint DELETE para excluir um produto.
    public ResponseEntity<Void> deletarProduto(@PathVariable Integer id) { // Recebe o ID do produto a ser excluído.
        // Busca o produto pelo ID
        if (produtoRepository.existsById(id)) { // Verifica se o produto existe.
            produtoRepository.deleteById(id); // Exclui o produto pelo ID.
            return ResponseEntity.noContent().build(); // Retorna uma resposta HTTP com status 204 (No Content) indicando que a deleção foi bem-sucedida.
        } else {
            return ResponseEntity.notFound().build(); // Se o produto não existe, retorna uma resposta HTTP com status 404 (Not Found).
        }
    }
}
