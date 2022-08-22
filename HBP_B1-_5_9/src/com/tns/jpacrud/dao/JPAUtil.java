package com.tns.jpacrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory factory;
	static EntityManager entityManager;
	
	static {
	factory =
			Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
	if(entityManager==null || !entityManager.isOpen()) {
	entityManager = factory.createEntityManager();
	}
	return entityManager;
}
		
}
