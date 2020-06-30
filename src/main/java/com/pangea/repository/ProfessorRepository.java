package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pangea.model.Professor;

@Repository(forEntity = Professor.class) 
public interface ProfessorRepository extends EntityRepository <Professor, Long>{
	
}
