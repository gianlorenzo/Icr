package it.uniroma3.icr.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Student student;
	@ManyToMany
	List<Image> images;
	@ManyToMany
	List<Job> jobs;
	@ManyToMany
	List<Symbol> symbols;
	@ManyToOne
	@JoinTable(name="Result_Task")
	private Result result;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Task() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public Task(Long id, Student student, List<Image> images, List<Job> jobs, List<Symbol> symbols, Result result) {
		super();
		this.id = id;
		this.student = student;
		this.images = images;
		this.jobs = jobs;
		this.symbols = symbols;
		this.result = result;
	}

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}

	

	
	
	

	

	
	
}

