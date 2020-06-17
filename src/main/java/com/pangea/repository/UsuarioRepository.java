package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pagea.model.Turma;
import com.pagea.model.Usuario;

@Repository(forEntity = Turma.class)
public interface UsuarioRepository extends EntityRepository<Usuario, Long> {

}
