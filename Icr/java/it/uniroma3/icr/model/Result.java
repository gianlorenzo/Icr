package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity 
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Task task;
	
//	@ManyToOne
//	private Image image;
	
	@Column(nullable=false)
	private String answer;
	@ManyToMany
	private List<Image> images;
	
	
	
	public Result() {
		
	}

	
	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
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


	public List<Image> getImages() {
		return images;
	}


	public void setImages(List<Image> images) {
		this.images = images;
	}

//
//	public Image getImage() {
//		return image;
//	}
//
//
//	public void setImage(Image image) {
//		this.image = image;
//	}


	public Result(Long id, Task task, String answer, List<Image> images) {
		super();
		this.id = id;
		this.task = task;
		this.answer = answer;
		this.images = images;
	}

}
