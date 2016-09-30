package it.uniroma3.icr.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private int x;
	
	@Column(nullable = false)
	private int y;
	
	@Column(nullable=false)
	private int width;
	
	@Column(nullable = false)
	private int height;
	
	@Column(nullable = false)
	private String page;
	
	@Column(nullable = false)
	private String manuscript;
	
	@Column(nullable=false)
	private String type;
	
	@ManyToMany(mappedBy="image")
	private List<Job> jobs;
	
	@ManyToMany(mappedBy="images")
	private List<Task> tasks;

	

	public Image(Long id, int x, int y, int width, int height, String page, String manuscript, String type,
			List<Job> jobs, List<Task> tasks) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.page = page;
		this.manuscript = manuscript;
		this.type = type;
		this.jobs = jobs;
		this.tasks = tasks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getManuscript() {
		return manuscript;
	}

	public void setManuscript(String manuscript) {
		this.manuscript = manuscript;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	

	@Override
	public String toString() {
		return "Image [id=" + id + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", page="
				+ page + ", manuscript=" + manuscript + ", type=" + type + ", jobs=" + jobs + ", tasks=" + tasks + "]";
	}

	public Image() {
		
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	
	
	
	
	
	
}
