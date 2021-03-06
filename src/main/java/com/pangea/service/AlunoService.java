package com.pangea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.pangea.model.Aluno;
import com.pangea.repository.AlunoRepository;


@Stateless
public class AlunoService {
	
	@Inject
	AlunoRepository alunoRepository;
	
	
	public Aluno salvarAluno(Aluno aluno) {
		aluno.setIsAtivo(true);
		Aluno alunoSalvo = alunoRepository.saveAndFlush(aluno);
		
		return alunoSalvo;
	}

}
