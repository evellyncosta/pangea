package com.pangea.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.pagea.model.Responsavel;

@Repository(forEntity = Responsavel.class)
public interface ResponsavelRepository extends EntityRepository<Responsavel, Long>{

}
