package it.uniroma3.icr.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.TaskDao;
import it.uniroma3.icr.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void insertTask(Task task) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(task);
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> findAll() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Task";
		Query query = session.createQuery(hql);
		List<Task> empList = query.list();
		System.out.println("Task List:" + empList);
		return empList;
	}

	@Override
	public Task findTask(String title) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String s ="FROM Task t WHERE t.title = :title";
		Query query = session.createQuery(s);
		query.setParameter("title", title);
		Task t = (Task)query.uniqueResult();
		return t;
	}

}
