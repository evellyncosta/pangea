package com.pagea.resources;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.pangea.repository.ResponsavelRepository;

@Path("/responsaveis")
public class ResponsavelResource {
	@Inject
	ResponsavelRepository responsavelRespository;
}
