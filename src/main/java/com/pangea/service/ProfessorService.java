package com.pangea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pangea.model.Professor;
import com.pangea.repository.ProfessorRepository;

@Stateless
public class ProfessorService {
	
	@Inject
	ProfessorRepository professorRepository;

	public Professor salvarProfessor(Professor professor) {
		professor.setIsAtivo(true);
		Professor professorSalvo = professorRepository.saveAndFlush(professor);
		return professorSalvo;
	}

}
