package com.pangea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pangea.model.Curso;
import com.pangea.repository.CursoRepository;

@Stateless
public class CursoService {
	@Inject
	CursoRepository cursoRepository;
	
	public Curso salvarCurso(Curso curso) {
		Curso cursoSalvo = cursoRepository.saveAndFlush(curso);
		
		return cursoSalvo;
	}

}
