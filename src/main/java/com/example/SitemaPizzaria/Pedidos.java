
package com.example.SitemaPizzaria;

import jakarta.persistence.*; // Importa as anotações JPA.
import java.time.LocalDateTime; // Importa a classe LocalDateTime para manipulação de datas.

@Entity
@Table(name = "Pedidos") // Define a entidade como uma tabela chamada "Pedidos" no banco de dados.
public class Pedidos {

    @Column(name = "Id_Pedido") // Mapeia a coluna "Id_Pedido" da tabela.
    @Id // Indica que este campo é a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor do ID é gerado automaticamente.
    int IdPedido; // Campo que armazena o ID do pedido.



    @Column(name = "Forma_De_Pagamento") // Mapeia a coluna "Forma_De_Pagamento" da tabela.
    String FormaDePagamento; // Campo que armazena a forma de pagamento do pedido.

    @Column(name = "Data_E_Hora_Pedido") // Mapeia a coluna "Data_E_Hora_Pedido" da tabela.
    LocalDateTime DataEHoraPedido; // Campo que armazena a data e hora do pedido.

    @ManyToOne // Define um relacionamento muitos para um com a entidade Cliente.
    @JoinColumn(name = "Cliente_id") // Mapeia a coluna "Cliente_id" que referencia a tabela Cliente.
    private Cliente cliente; // Campo que armazena o cliente associado ao pedido.

    public int getIdPedido() { // Método getter para o ID do pedido.
        return IdPedido;
    }

    public void setIdPedido(int idPedido) { // Método setter para o ID do pedido.
        IdPedido = idPedido;
    }

    public String getFormaDePagamento() { // Método getter para a forma de pagamento.
        return FormaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) { // Método setter para a forma de pagamento.
        FormaDePagamento = formaDePagamento;
    }

    public LocalDateTime getDataEHoraPedido() { // Método getter para a data e hora do pedido.
        return DataEHoraPedido;
    }

    public void setDataEHoraPedido(LocalDateTime dataEHoraPedido) { // Método setter para a data e hora do pedido.
        DataEHoraPedido = dataEHoraPedido;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}


