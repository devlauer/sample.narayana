package de.elnarion.sample.narayana.impl;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import de.elnarion.sample.narayana.domain.User;

@Named
public class ServiceImpl {

	public ServiceImpl() {
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@PersistenceContext(unitName="na_ctx")
	private EntityManager entityManager;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void doSomething()
	{
		List<User> resultList = entityManager.createQuery("Select u from User u",User.class).getResultList();
	}

}
