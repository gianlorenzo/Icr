package it.uniroma3.icr.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.UtenteDao;
import it.uniroma3.icr.model.Utente;

@Repository
public class UtenteDaoImpl implements UtenteDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertUtente(Utente utente){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(utente);
		session.getTransaction().commit();
		
	}
	
	public Utente findUtente(String username) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String s = "FROM Utente u WHERE u.username = :username";
		Query query = session.createQuery(s);
		query.setParameter("username", username);
		Utente u = (Utente)query.uniqueResult();
		return u;
		
		
	}
	
}
