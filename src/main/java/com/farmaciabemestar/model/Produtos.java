package com.farmaciabemestar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_produtos")
public class Produtos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private Long id;
	
	@NotBlank (message ="O atributo nome não pode estar vazio")
	@Size (min = 1, max = 35, message = "O nome tem que conter no mínimo 1 e no maxímo 35 caractares.")
	private String nome;
	
	@NotBlank (message ="O atributo nome não pode estar vazio")
	private String descricao;
	
	
	@NotNull (message = "A validade não pode ser nula") 
	private Integer validade;
	
	@NotNull (message = "A quantidade não pode ser nula de não tiver estoque digite 0") 
	private Integer quantEstoque;
	
	@Column(nullable = false) 
    private Double preco;
	
	@ManyToOne //N:1 (chave PK)
	@JsonIgnoreProperties("produtos") 
	private Categorias categorias;

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getValidade() {
		return validade;
	}

	public void setValidade(Integer validade) {
		this.validade = validade;
	}

	public Integer getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(Integer quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}
