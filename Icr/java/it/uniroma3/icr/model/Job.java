package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Job {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private int taskSize;
	
	@Column(nullable = false)
	private int numberOfImages;
	
	@Column(nullable=false)
	private double percentageType1;
	
	@Column(nullable=false)
	private double percentageType2;
	
	@Column(nullable=false)
	private double percentageType3;
	
	@Column(nullable=false)
	private int numberOfStudents;
	
	@ManyToMany
	List<Image> image;
	
	@OneToMany(mappedBy="job")
	List<Task> tasks; 
	
	@ManyToOne
	private Symbol symbol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getImages() {
		return numberOfImages;
	}

	public void setImages(int images) {
		this.numberOfImages = images;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	public double getPercentageType1() {
		return percentageType1;
	}

	public void setPercentageType1(double percentageType1) {
		this.percentageType1 = percentageType1;
	}

	public double getPercentageType2() {
		return percentageType2;
	}

	public void setPercentageType2(double percentageType2) {
		this.percentageType2 = percentageType2;
	}

	public double getPercentageType3() {
		return percentageType3;
	}

	public void setPercentageType3(double percentageType3) {
		this.percentageType3 = percentageType3;
	}

	public int getStudents() {
		return numberOfStudents;
	}

	public void setStudents(int students) {
		this.numberOfStudents = students;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTaskSize() {
		return taskSize;
	}

	public void setTaskSize(int taskSize) {
		this.taskSize = taskSize;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Job(Long id, String title, int taskSize, int images, 
			double percentageType1, double percentageType2,
			double percentageType3, int students, List<Image> image, 
			List<Task> tasks, Symbol symbol) {
		super();
		this.id = id;
		this.title = title;
		this.taskSize = taskSize;
		this.numberOfImages = images;
		this.percentageType1 = percentageType1;
		this.percentageType2 = percentageType2;
		this.percentageType3 = percentageType3;
		this.numberOfStudents = students;
		this.image = image;
		this.tasks = tasks;
		this.symbol = symbol;
	}
	
	public Job() {
		
	}

}
