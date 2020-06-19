package com.pangea.repository;

import javax.transaction.Transactional;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;


import com.pagea.model.Aluno;


@Repository(forEntity = Aluno.class) 
public interface AlunoRepository extends EntityRepository <Aluno, Long>{

	
}
