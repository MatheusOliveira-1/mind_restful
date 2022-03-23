package com.matheusoliveira.mindrestful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório")
	@Size(max = 255, message = "O nome deve ter no máximo 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O tipo de usuário é obrigatório")
	private int tipo;
	
	//Incluir annotation Schema após inclusão do Swagger
	@NotBlank(message = "O e-mail é obrigatório")
	@Email(message = "Você deve digitar um e-mail válido")
	@Size(max = 255, message = "O e-mail deve ter no máximo 255 caracteres")
	private String email;
	
	@NotBlank
	@Size(min = 8, max = 255, message = "A senha deve ter no máximo 255 caracteres")
	private String senha;
	
	private int tempoLogado;
	
	private String foto;
	
	//Incluir @OneToMany Postagem
	//Incluir @OneToMany Comentario
	//Incluir @OneToMany ResComentario
	//Incluir @OneToMany Notificacao

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTempoLogado() {
		return tempoLogado;
	}

	public void setTempoLogado(int tempoLogado) {
		this.tempoLogado = tempoLogado;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
