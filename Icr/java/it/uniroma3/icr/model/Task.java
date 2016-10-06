package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Job job;
	
	@OneToMany(mappedBy="task")
	private List<Result> results;
	
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

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Task(Long id, Student student, Job job, List<Result> results) {
		super();
		this.id = id;
		this.student = student;
		this.job = job;
		this.results = results;
	}

	public Task() {
		
	}

	@Override
	public String toString() {
		return "Task [id=" + id;
	}
	
	
	
}

