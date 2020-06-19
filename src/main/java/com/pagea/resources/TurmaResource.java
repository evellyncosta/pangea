package com.pagea.resources;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pagea.model.Turma;
import com.pagea.service.TurmaService;
import com.pangea.repository.TurmaRepository;

@Path("/turmas")
public class TurmaResource {
	@Inject
	TurmaRepository turmaRepository;
	
	@Inject
	TurmaService turmaService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTurmas() {
		List<Turma> turmas = new ArrayList<Turma>();
		turmas = turmaRepository.findAll();
		return Response.ok(turmas).build();
	}
	


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarTurma(Turma turma) {
		Turma turmaSalva = turmaService.salvarTurma(turma);
		return Response.status(201).entity(turmaSalva).build();
	}
	
}
