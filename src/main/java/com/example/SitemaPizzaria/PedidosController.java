package com.example.SitemaPizzaria;

import org.springframework.beans.factory.annotation.Autowired; // Importa a anotação para injeção de dependência.
import org.springframework.http.ResponseEntity; // Importa a classe ResponseEntity para manipulação de respostas HTTP.
import org.springframework.web.bind.annotation.*; // Importa as anotações para criar endpoints REST.

import java.time.LocalDateTime; // Importa a classe LocalDateTime para manipulação de datas.
import java.util.List; // Importa a classe List para trabalhar com listas.
import java.util.Optional; // Importa a classe Optional para manipulação de valores que podem ser nulos.

@RestController // Indica que esta classe é um controlador REST.
@RequestMapping("/Pizzaria") // Define a rota base para os endpoints desta classe.
public class PedidosController {

    @Autowired // Injeção de dependência do repositório de pedidos.
    PedidosRepository pedidosRepository; // Repositório para operações CRUD na entidade Pedidos.

    // Lista todos os pedidos
    @GetMapping("/Listarpedidos") // Define um endpoint GET para listar pedidos.
    public List<Pedidos> listarPedidos() {
        return pedidosRepository.findAll(); // Busca todos os pedidos no banco de dados.
    }

    // Cadastra um novo pedido
    @PostMapping("/cadastrarPedido") // Define um endpoint POST para cadastrar um novo pedido.
    public Pedidos cadastrarPedido(@RequestBody Pedidos novoPedido) { // Recebe um objeto Pedidos no corpo da requisição.
        novoPedido.setDataEHoraPedido(LocalDateTime.now()); // Define a data e hora do pedido automaticamente.
        return pedidosRepository.save(novoPedido); // Salva o pedido no banco de dados e retorna o objeto salvo.
    }

    // Atualiza um pedido existente
    @PutMapping("/atualizarPedido/{id}") // Define um endpoint PUT para atualizar um pedido existente.
    public ResponseEntity<Pedidos> atualizarPedido(@PathVariable Integer id, @RequestBody Pedidos pedidoAtualizado) { // Recebe o ID e o objeto atualizado.
        Optional<Pedidos> pedidoExistente = pedidosRepository.findById(id); // Busca o pedido pelo ID.
        if (pedidoExistente.isPresent()) { // Verifica se o pedido existe.
            pedidoAtualizado.setIdPedido(id); // Garante que o ID do pedido não seja alterado.
            return ResponseEntity.ok(pedidosRepository.save(pedidoAtualizado)); // Salva o pedido atualizado e retorna a resposta 200 OK.
        } else {
            return ResponseEntity.notFound().build(); // Retorna uma resposta 404 Not Found se o pedido não existir.
        }
    }

    // Exclui um pedido
    @DeleteMapping("/deletarPedido/{id}") // Define um endpoint DELETE para excluir um pedido.
    public ResponseEntity<Void> deletarPedido(@PathVariable Integer id) { // Recebe o ID do pedido a ser excluído.
        pedidosRepository.deleteById(id); // Exclui o pedido pelo ID.
        return ResponseEntity.noContent().build(); // Retorna uma resposta 204 No Content indicando que a exclusão foi bem-sucedida.
    }
}

