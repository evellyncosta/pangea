package com.pagea.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String login;
	private String senha;
	private LocalDate dataCadastro;
	private Boolean isAtivo;

}
