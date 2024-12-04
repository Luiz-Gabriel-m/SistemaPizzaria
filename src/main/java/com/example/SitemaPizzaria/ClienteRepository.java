package com.example.SitemaPizzaria;

import org.springframework.data.jpa.repository.JpaRepository; // Importa a interface JpaRepository para operações CRUD.
import org.springframework.stereotype.Repository; // Indica que esta interface é um repositório.

@Repository // Anotação que marca a interface como um repositório Spring.
interface ClienteRepository extends JpaRepository<Cliente, Integer> { // Extende JpaRepository, permitindo operações CRUD na entidade Cliente.
}

