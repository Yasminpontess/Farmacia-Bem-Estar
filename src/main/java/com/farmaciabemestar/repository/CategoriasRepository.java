package com.farmaciabemestar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmaciabemestar.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long>{

	Optional<Categorias> findByMarca(String marca);

	Optional<Categorias> findBySolucao(String solucao);

	
	


}
