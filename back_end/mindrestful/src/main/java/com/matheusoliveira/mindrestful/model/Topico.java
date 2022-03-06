package com.matheusoliveira.mindrestful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_toppicos")
public class Topico {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank(message = "O campo nome não pode ser vazio")
	@Size(max = 255, message = "O nome deve ter no máximo 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O campo descricao não pode ser vazio")
	@Size(max = 255, message = "O descricao deve ter no máximo 255 caracteres")
	private String descricao;

	//Criar relacao @OneToMany com Postagem
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
		

}
