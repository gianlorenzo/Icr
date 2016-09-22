package it.uniroma3.icr.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.SimboloDao;
import it.uniroma3.icr.model.Simbolo;

@Repository
public class SimboloDaoImpl implements SimboloDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Simbolo findSimbolo(String trascrizione) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String s ="FROM Simbolo s WHERE s.trascrizione = :trascrizione";
		Query query = session.createQuery(s);
		query.setParameter("trascrizione", trascrizione);
		Simbolo j = (Simbolo)query.uniqueResult();
		return j;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Simbolo> findAll() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Simbolo";
		Query query = session.createQuery(hql);
		List<Simbolo> empList = query.list();
		System.out.println("Simbolo List:" + empList);
		return empList;
		
	}

}
