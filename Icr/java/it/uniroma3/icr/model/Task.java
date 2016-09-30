package it.uniroma3.icr.model;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Student student;
	
	
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


	public Task(Long id, Student student) {
		super();
		this.id = id;
		this.student = student;
	}
}

