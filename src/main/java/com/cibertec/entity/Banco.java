package com.cibertec.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Banco")
public class Banco {

	private Integer id_banco;
	private String nombre_banco;
	
}



