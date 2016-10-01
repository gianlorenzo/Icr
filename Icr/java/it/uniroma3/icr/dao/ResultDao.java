package it.uniroma3.icr.dao;

import java.util.List;

import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.model.Task;

public interface ResultDao {
	public void insertResult(Result result);
	
	public Result findResult(long id);
	
	public List<Result> findAll();
	
	public void insertTaskToResult(Result r, Task t);
	
	

}
