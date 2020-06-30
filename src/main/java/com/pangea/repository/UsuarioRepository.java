package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pangea.model.Turma;
import com.pangea.model.Usuario;

@Repository(forEntity = Turma.class)
public interface UsuarioRepository extends EntityRepository<Usuario, Long> {

}
