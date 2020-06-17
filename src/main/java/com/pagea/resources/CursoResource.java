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

import com.pagea.model.Curso;
import com.pagea.service.CursoService;
import com.pangea.repository.CursoRepository;

@Path("/cursos")
public class CursoResource {
	@Inject
	CursoRepository cursoRepository;

	@Inject
	CursoService cursoService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarAgendamentosEmail() {
		List<Curso> cursos = cursoRepository.findAll();
		return Response.ok(cursos).build();
	}
	


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarCurso(Curso curso) {
		Curso cursoSalvo = cursoService.salvarCurso(curso);
		return Response.status(201).entity(cursoSalvo).build();
	}
}
