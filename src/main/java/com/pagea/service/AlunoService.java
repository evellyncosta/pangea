package com.pagea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pagea.model.Aluno;
import com.pangea.repository.AlunoRepository;

@Stateless
public class AlunoService {
	
	@Inject
	AlunoRepository alunoRepository;
	
	public Aluno salvarAluno(Aluno aluno) {
		Aluno alunoSalvo = alunoRepository.saveAndFlush(aluno);
		
		return alunoSalvo;
	}

}
