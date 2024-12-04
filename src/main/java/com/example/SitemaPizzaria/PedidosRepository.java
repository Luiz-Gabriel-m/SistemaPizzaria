
package com.example.SitemaPizzaria;

import org.springframework.data.jpa.repository.JpaRepository; // Importa a interface JpaRepository para operações CRUD.
import org.springframework.data.jpa.repository.Query; // Importa a anotação Query para consultas personalizadas.
import org.springframework.stereotype.Repository; // Indica que esta interface é um repositório.

import java.util.List; // Importa a classe List para trabalhar com listas.

@Repository // Anotação que marca a interface como um repositório Spring.
public interface PedidosRepository extends JpaRepository<Pedidos, Integer> { // Extende JpaRepository, permitindo operações CRUD na entidade Pedidos.

}














/*package com.example.SitemaPizzaria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PedidosRepository extends JpaRepository<Pedidos, Integer> {



}
*/