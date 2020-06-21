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

import com.pagea.model.Professor;
import com.pagea.service.ProfessorService;
import com.pangea.repository.ProfessorRepository;

@Path("/professores")
public class ProfessorResourece {
	@Inject
	ProfessorRepository professorRepository;
	
	@Inject
	ProfessorService professorService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response lsitarProfessores() {
		List<Professor> professores = new ArrayList<Professor>();
		professores = professorRepository.findAll();
		return Response.ok(professores).build();
	}	


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarProfessor(Professor professor) {
		Professor professorSalvo = professorService.salvarProfessor(professor);
		return Response.status(201).entity(professorSalvo).build();
	}
}
