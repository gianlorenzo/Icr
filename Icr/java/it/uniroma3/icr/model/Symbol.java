package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Symbol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String transcription;
	
	@Column(nullable=false)
	private String type;
	
	@OneToMany(mappedBy="symbol")
	private List<Job> jobs;
	
	@ManyToMany(mappedBy="symbols")
	private List<Task> tasks;
	
	public Symbol() {
		
	}

	
	
	public Symbol(Long id, String transcription, String type, List<Job> jobs, List<Task> tasks) {
		super();
		this.id = id;
		this.transcription = transcription;
		this.type = type;
		this.jobs = jobs;
		this.tasks = tasks;
	}
	

	public List<Job> getJobs() {
		return jobs;
	}



	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}



	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTranscription() {
		return transcription;
	}

	public void setTranscription(String transcription) {
		this.transcription = transcription;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Symbol [id=" + id + ", transcription=" + transcription + ", type=" + type +  "]";
	}

	

	
	
	

	

	
	

}
