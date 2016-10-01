package it.uniroma3.icr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.ResultDaoImpl;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.model.Task;

@Service
public class ResultFacade {

	@Autowired
	private ResultDaoImpl resultDaoImpl;
	
	public void addResult(Result r) {
		resultDaoImpl.insertResult(r);
	}
	
	public Result retriveResult(long id) {
		return this.resultDaoImpl.findResult(id);
	}
	
	public List<Result> retriveAllResult() {
		return this.resultDaoImpl.findAll();
	}
	
	public void insertTaskToResult(Result r, Task t) {
		resultDaoImpl.insertTaskToResult(r, t);
	}
	
	
}
