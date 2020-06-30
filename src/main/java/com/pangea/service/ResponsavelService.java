package com.pangea.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pangea.model.Responsavel;
import com.pangea.repository.ResponsavelRepository;

@Stateless
public class ResponsavelService {
	@Inject
	ResponsavelRepository responsavelRepository;
	
	public Responsavel salvarResponsavel(Responsavel responsavel) {
		Responsavel responsavelSalvo = responsavelRepository.saveAndFlush(responsavel);
		return responsavelSalvo;
	}
}
