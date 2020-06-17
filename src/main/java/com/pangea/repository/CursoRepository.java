package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pagea.model.Curso;




@Repository(forEntity = Curso.class) 
public interface CursoRepository extends EntityRepository<Curso, Long> {

}
