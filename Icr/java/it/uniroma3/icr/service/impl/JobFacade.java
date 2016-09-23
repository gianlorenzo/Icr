package it.uniroma3.icr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.JobDaoImpl;
import it.uniroma3.icr.model.Job;

@Service
public class JobFacade {

	@Autowired
	private JobDaoImpl jobDaoImpl;
	
	public void addJob(Job j) {
		jobDaoImpl.insertJob(j);
	}
	
	public Job retriveJob(String title) {
		return this.jobDaoImpl.findJob(title);
	}
	
	public List<Job> retriveAlljobs() {
		return this.jobDaoImpl.findAll();
	}
	
	
	
}
