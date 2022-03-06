package com.matheusoliveira.mindrestful.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	private Long id;
	
	private String titulo;
	
	private String texto;
	
	private LocalDateTime data;
	
	private String foto;
	
	private String video;
	
	
	

}
