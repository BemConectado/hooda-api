package com.generation.hooda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.hooda.model.Produto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);


}
