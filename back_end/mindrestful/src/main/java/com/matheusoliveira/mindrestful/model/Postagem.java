package com.matheusoliveira.mindrestful.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O campo título é obrigatório!")
	@Size(max = 100, message = "O título deve ter no máximo 100 caractéres")
	private String titulo;
	
	@NotBlank(message = "O campo texto é obrigatório!")
	@Size(max = 1000, message = "O texto deve ter no máximo 1000 caractéres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	private String foto;
	
	private String video;
	
	//Incluir @ManyToOne Topico
	//Incluir @ManyToOne Usuario
	//Incluir @OneToMany Comentario
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	


}
