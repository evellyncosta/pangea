package com.pangea.resources;


import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pangea.model.Usuario;
import com.pangea.repository.UsuarioRepository;
import com.pangea.service.UsuarioService;

@Path("/usuarios")
public class UsuarioResource {
	@Inject
	UsuarioRepository usuarioRepository;
	
	@Inject
	UsuarioService usuarioService;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response listarUsuarios() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return Response.ok(usuarios).build();
	}
	
}
