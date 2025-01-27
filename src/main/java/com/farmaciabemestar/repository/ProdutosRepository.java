package com.farmaciabemestar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmaciabemestar.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	Optional<Produtos> findByNome(String nome);

	Optional<Produtos> findByDescricao(String descricao);

	
}
