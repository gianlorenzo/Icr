package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy="result")
	private List<Task> tasks;
	
	@OneToMany(mappedBy="result")
	private List<Image> img;
	
	@Column(nullable = false)
	private char answer;
	
	public Result() {
		
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Result(Long id, List<Task> tasks, List<Image> img, char answer) {
		super();
		this.id = id;
		this.tasks = tasks;
		this.img = img;
		this.answer = answer;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Image> getImg() {
		return img;
	}

	public void setImg(List<Image> img) {
		this.img = img;
	}

	

	

}
