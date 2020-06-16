package com.pagea.resources;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pagea.model.Aluno;
import com.pangea.repository.AlunoRepository;




@Path("/alunos")
public class AlunoResource {
	
	@Inject
	AlunoRepository alunoRepository;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarAgendamentosEmail() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos = alunoRepository.findAll();
		
		return Response.ok(alunos).build();
		
	}
}
