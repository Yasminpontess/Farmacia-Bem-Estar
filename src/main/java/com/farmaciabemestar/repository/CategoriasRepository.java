package com.farmaciabemestar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmaciabemestar.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long>{

	Optional<Categorias> findAllByMarcaContainingIgnoreCase(@Param("categorias")String marca);

	Optional<Categorias> findAllBySolucaoContainingIgnoreCase(@Param("categorias")String solucao);


	
	

	
	


}
