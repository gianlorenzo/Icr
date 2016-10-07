package it.uniroma3.icr.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.ResultDaoImpl;
import it.uniroma3.icr.model.Image;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.model.Student;
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
	
	public void updateResult(Result result) {
		resultDaoImpl.updateResult(result);
	}
	
	public List<Result> findTaskResult(Task task) {
		return this.resultDaoImpl.findTaskResults(task);
	}
	
	public void deleteResult(long id) {
		resultDaoImpl.deleteResult(id);
	}
	
	public void updateListResult(List<Result> results) {
		resultDaoImpl.updateListResult(results);
	}
	
	
	public static void main(String[] args) {
		
		StudentFacade sF = new StudentFacade();
		JobFacade jF = new JobFacade();
		TaskFacade tF = new TaskFacade();
		ResultFacade rF = new ResultFacade();
		
		List<Image> images = new ArrayList<>();
		Student s = new Student();
		s.setFreshman(1l);
		s.setName("c");
		s.setSurname("c");
		s.setRole("ROLE_USER");
		s.setUsername("c");
		s.setPassword("c");
		
		Image i1 = new Image();
		Image i2 = new Image();
		
		i1.setX(1);
		i1.setY(1);
		i1.setWidth(10);
		i1.setPage("1");
		i1.setManuscript("c");
		i1.setHeight(10);
		i1.setType("t1");
		
		i2.setX(1);
		i2.setY(1);
		i2.setWidth(10);
		i2.setPage("1");
		i2.setManuscript("c");
		i2.setHeight(10);
		i2.setType("t1");
		
		
		images.add(i1);
		images.add(i2);
		
		Job job = new Job();
		
		job.setImages(30);
		
		job.setNumberOfStudents(1);
		job.setPercentageType1(1);
		job.setPercentageType2(1);
		job.setPercentageType3(3);
		job.setTitle("c");
		job.setTaskSize(3);
		
		job.setImage(images);
		
		Task task = new Task();
		
		task.setJob(job);
		task.setStudent(s);
		
		Result r1 = new Result();
		Result r2 = new Result();
		
		r1.setTask(task);
		r1.setImage(i1);
		r2.setTask(task);
		r2.setImage(i2);
		
		sF.addUser(s);
		
		jF.addJob(job);
		
		tF.addTask(task);
		
		rF.addResult(r1);
		rF.addResult(r2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
