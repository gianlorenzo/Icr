package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Student student;
	
	@ManyToMany
	List<Job> jobs;
	
	@ManyToMany
	private List<Symbol> symbols;
	
	@OneToMany(mappedBy="task")
	private List<Result> results;
	
	@ManyToMany
	List<Image> images;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Task(Long id, Student student, List<Job> jobs, List<Symbol> symbols, List<Result> results,
			List<Image> images) {
		super();
		this.id = id;
		this.student = student;
		this.jobs = jobs;
		this.symbols = symbols;
		this.results = results;
		this.images = images;
	}
	
	
	public Task() {
		
	}
	
	
	
	

}

