package com.pagea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.Valid;

import com.pagea.model.Turma;
import com.pangea.repository.TurmaRepository;

@Stateless
public class TurmaService {
	
	@Inject
	TurmaRepository turmaRepository;
	
	public Turma salvarTurma(Turma turma) {
		Turma turmaSalva = turmaRepository.saveAndFlush(turma);
		
		return turmaSalva;
	}

}
