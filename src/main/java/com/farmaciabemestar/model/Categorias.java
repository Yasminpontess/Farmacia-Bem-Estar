package com.farmaciabemestar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo é Obrigatorio!")
	@Size(max= 30, message = "O atributo texto deve conter no maxímo 30 caracteres")
	private String marca;
	
	@NotBlank(message = "O atributo é Obrigatorio!")
	@Size(max= 30, message = "O atributo texto deve conter no maxímo 30 caracteres")
	private String solucao;
	
	@OneToMany (fetch = FetchType.LAZY, mappedBy = "categorias", cascade = CascadeType.REMOVE)  //1:N (chave PK)
	@JsonIgnoreProperties("categorias") 
	private List<Produtos> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	
	}
	
	
	
	

