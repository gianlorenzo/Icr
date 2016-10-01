package it.uniroma3.icr.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.ResultDao;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.model.Task;

@Repository
public class ResultDaoImpl implements ResultDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertResult(Result result) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(result);
		session.getTransaction().commit();
	}

	@Override
	public Result findResult(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Result r = (Result) session.get(Result.class, id);
		return r;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Result> findAll() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Result";
		Query query = session.createQuery(hql);
		List<Result> empList = query.list();
		return empList;
	}

	@Override
	public void insertTaskToResult(Result r, Task t) {
		Session session = sessionFactory.openSession();
		List<Task> tasks = new ArrayList<>();
		tasks.add(t);
		r.setTasks(tasks);
		session.merge(r);
		session.merge(t);
		session.flush();
	}

	

}
