package it.uniroma3.icr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.TaskDaoImpl;
import it.uniroma3.icr.model.Task;

@Service
public class TaskFacade {

	@Autowired
	private TaskDaoImpl taskDaoImpl;
	
	public void addTask(Task t) {
		taskDaoImpl.insertTask(t);
	}
	
	public Task retriveJob(long id) {
		return this.taskDaoImpl.findTask(id);
	}
	
	public List<Task> retriveAllTask() {
		return this.taskDaoImpl.findAll();
	}
	
}
