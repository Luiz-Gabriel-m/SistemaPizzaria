package com.example.SitemaPizzaria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Query("select p from pessoas p where p.nome like CONCAT('%', :nome, '%')")
    List<Produto> buscarPorNome(@Param("nome")String nome);


}
