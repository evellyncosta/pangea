package com.pagea.util;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.apache.deltaspike.jpa.api.transaction.TransactionScoped;



@ApplicationScoped
public class EntityManagerProducer {

	@PersistenceUnit(name = "agendamento")
	private EntityManagerFactory emf;

	 @Produces
	    @TransactionScoped
	public EntityManager create() {
		return emf.createEntityManager();
	}

	public void close(@Disposes @Default EntityManager em) {
		if (em.isOpen()) {
			em.close();
		}
	}

}
