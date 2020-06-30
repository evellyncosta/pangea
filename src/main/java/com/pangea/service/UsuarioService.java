package com.pangea.service;

import java.time.LocalDate;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pangea.model.Usuario;
import com.pangea.repository.UsuarioRepository;

@Stateless
public class UsuarioService {
	@Inject
	UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usuario) {
		LocalDate dataAtual = LocalDate.now();
		
		usuario.setDataCadastro(dataAtual);
		usuario.setIsAtivo(true);
		
		Usuario usuarioSalvo = usuarioRepository.saveAndFlush(usuario);
		
		return usuarioSalvo;
	}
	

}
