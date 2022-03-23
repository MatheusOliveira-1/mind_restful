package com.matheusoliveira.mindrestful.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_notificacoes")
public class Notificacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@UpdateTimestamp
	private LocalDateTime data;
	
	@NotBlank(message = "O comentário não pode ser publicado em branco")
	private String texto;
	
	//Incluir @ManyToOne Usuario
	//Incluir @OneToOne Comentario
	//Incluir @OneToOne ResComentario

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
