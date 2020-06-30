package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pangea.model.Turma;

@Repository(forEntity = Turma.class)
public interface TurmaRepository extends EntityRepository<Turma, Long>{

}
