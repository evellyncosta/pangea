package com.pagea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pagea.model.Professor;
import com.pangea.repository.ProfessorRepository;

@Stateless
public class ProfessorService {
	
	@Inject
	ProfessorRepository professorRepository;

	public Professor salvarProfessor(Professor professor) {
		Professor professorSalvo = professorRepository.saveAndFlush(professor);
		return professorSalvo;
	}

}
