package it.uniroma3.icr.dao;

import java.util.List;

import it.uniroma3.icr.model.Result;

public interface ResultDao {
	public void insertResult(Result result);
	
	public Result findResult(long id);
	
	public List<Result> findAll();

}
