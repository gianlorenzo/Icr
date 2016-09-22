package it.uniroma3.icr.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.SymbolDao;
import it.uniroma3.icr.model.Symbol;

@Repository
public class SymbolDaoImpl implements SymbolDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Symbol findSymbol(String transcription) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String s ="FROM Symbol s WHERE s.transcription = :transcription";
		Query query = session.createQuery(s);
		query.setParameter("transcription", transcription);
		Symbol j = (Symbol)query.uniqueResult();
		return j;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Symbol> findAll() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Symbol";
		Query query = session.createQuery(hql);
		List<Symbol> empList = query.list();
		System.out.println("Symbols List:" + empList);
		return empList;
		
	}

}
