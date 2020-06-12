package com.pagea.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.pangea.enums.Turno;



public class Turma implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private LocalDate horario;
	private Curso curso;
	private Turno turno;
	private Integer ciclo;
	private LocalDate dataInicializacao;
	private LocalDate dataFinalizacao;
	

}
