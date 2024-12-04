
package com.example.SitemaPizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Pizzaria")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    /**
     * Lista todos os clientes cadastrados no banco de dados.
     * @return Uma lista de objetos do tipo Cliente, representando todos os clientes.
     */
    @GetMapping("/Listarclientes")
    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }

    /**
     * Cadastra um novo cliente.
     * @param novoCliente Objeto Cliente com os dados do novo cliente a ser cadastrado.
     * @return O objeto Cliente cadastrado, incluindo o ID gerado pelo banco de dados.
     */
    @PostMapping("/cadastrarCliente")
    public Cliente cadastrarCliente(@RequestBody Cliente novoCliente) {
        return clienteRepository.save(novoCliente);
    }

    /**
     * Atualiza os dados de um cliente existente.
     * @param id O ID do cliente a ser atualizado.
     * @param clienteAtualizado Objeto Cliente com os novos dados a serem atualizados.
     * @return ResponseEntity com o código de status 200 (OK) se a atualização for bem-sucedida,
     * ou 404 (Not Found) se o cliente não for encontrado.
     */
    @PutMapping("/atualizarCliente/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Integer id, @RequestBody Cliente clienteAtualizado) {
        // Busca o cliente pelo ID
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);

        // Verifica se o cliente foi encontrado
        if (clienteExistente.isPresent()) {
            // Atualiza o ID do cliente atualizado para garantir que seja o mesmo do cliente existente
            clienteAtualizado.setIdCliente(id);
            // Salva as alterações no banco de dados
            clienteRepository.save(clienteAtualizado);
            // Retorna o cliente atualizado com o código de status 200
            return ResponseEntity.ok(clienteAtualizado);
        } else {
            // Retorna um código de status 404 indicando que o cliente não foi encontrado
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Exclui um cliente do banco de dados.
     * @param id O ID do cliente a ser excluído.
     * @return ResponseEntity com o código de status 204 (No Content) indicando que a exclusão foi bem-sucedida.
     */
    @DeleteMapping("/deletarCliente/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Integer id) {
        clienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}




