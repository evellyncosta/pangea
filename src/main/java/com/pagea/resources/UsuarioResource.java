package com.pagea.resources;


import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pagea.model.Usuario;
import com.pagea.service.UsuarioService;
import com.pangea.repository.UsuarioRepository;

@Path("/usuarios")
public class UsuarioResource {
	@Inject
	UsuarioRepository usuarioRepository;
	
	@Inject
	UsuarioService usuarioService;
	
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public Response listarUsuarios() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return Response.ok(usuarios).build();
	}
	
}
