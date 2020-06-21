package com.pagea.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pagea.model.Responsavel;
import com.pagea.service.ResponsavelService;
import com.pangea.repository.ResponsavelRepository;

@Path("/responsaveis")
public class ResponsavelResource {
	@Inject
	ResponsavelRepository responsavelRespository;
	
	@Inject
	ResponsavelService responsavelService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response listarReponsaveis() {
		List<Responsavel> responsaveis = responsavelRespository.findAll();
		return Response.ok(responsaveis).build();
	}
	


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarResponsavel(Responsavel responsavel) {
		Responsavel responsavelSalvo = responsavelService.salvarResponsavel(responsavel);
		return Response.status(201).entity(responsavelSalvo).build();
	}
	
}
