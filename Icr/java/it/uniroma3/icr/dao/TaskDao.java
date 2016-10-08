package it.uniroma3.icr.dao;

import java.util.List;

import it.uniroma3.icr.model.Task;

public interface TaskDao {
	
	public void insertTask(Task task);
	public Task findTask(long id);
	public void updateTask(Task task);
	public List<Task> findAll();
	public Task getTaskList(List<Task> list);

}
