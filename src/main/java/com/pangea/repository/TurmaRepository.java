package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pagea.model.Turma;

@Repository(forEntity = Turma.class)
public interface TurmaRepository extends EntityRepository<Turma, Long>{

}
