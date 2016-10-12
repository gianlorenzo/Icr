package it.uniroma3.icr.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.TaskDao;
import it.uniroma3.icr.model.Job;
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
		session.close();

		
	}

	@Override
	public Task findTask(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Task t = (Task) session.get(Job.class, id);
		return t;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> findAll() {
		Session session = sessionFactory.openSession();
		String hql ="FROM Task";
		Query query = session.createQuery(hql);
		List<Task> empList = query.list();
		return empList;
	}

	@Override
	public void updateTask(Task task) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(task);
		session.getTransaction().commit();
		session.close();
	}
	
	@Override
	public Task getTaskList(List<Task> list) {
		Task t = new Task();
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getStudent()==null)
				t = list.get(i);
		}
		return t;
	}
	
	
}
