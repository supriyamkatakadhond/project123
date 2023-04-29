package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.User;

public class UserDao
{
EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
EntityManager manager=factory.createEntityManager();
EntityTransaction transaction=manager.getTransaction();

public void save(User user)
{
	transaction.begin();
	manager.persist(user);
	transaction.commit();
}
}
