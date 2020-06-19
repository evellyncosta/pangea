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

import com.pagea.model.Aluno;
import com.pagea.service.AlunoService;
import com.pangea.repository.AlunoRepository;


@Path("/alunos")
public class AlunoResource {

	@Inject
	AlunoRepository alunoRepository;

	@Inject
	AlunoService alunoService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos = alunoRepository.findAll();
		return Response.ok(alunos).build();
	}
	


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarAluno(Aluno aluno) {
		Aluno alunoSalvo = alunoService.salvarAluno(aluno);
		return Response.status(201).entity(alunoSalvo).build();
	}
}
