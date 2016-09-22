package it.uniroma3.icr.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.UserDao;
import it.uniroma3.icr.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertUser(User user){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}
	
	public User findUser(String username) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String s = "FROM User u WHERE u.username = :username";
		Query query = session.createQuery(s);
		query.setParameter("username", username);
		User u = (User)query.uniqueResult();
		return u;
		
		
	}
	
}
