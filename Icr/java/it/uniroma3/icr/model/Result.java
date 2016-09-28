package it.uniroma3.icr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Task task;
	
	@OneToOne
	private Image image;
	
	@Column(nullable = false)
	private char answer;
	
	public Result() {
		
	}

	public Result(Long id, Task task, Image image, char answer) {
		super();
		this.id = id;
		this.task = task;
		this.image = image;
		this.answer = answer;
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

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	

	
	
	

}
