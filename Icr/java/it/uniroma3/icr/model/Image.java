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
	
	@ManyToMany(mappedBy="images")
	private List<Job> jobs;
	
	@OneToMany(mappedBy="image")
	private List<Result> results;

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

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	

	public Image(Long id, int x, int y, int width, int height, String page, String manuscript, String type,
			List<Job> jobs, List<Result> results) {
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
		this.results = results;
	}

	public Image () {
		
	}

	@Override
	public String toString() {
		return "Image [id=" + id ;
				
	}
	
	

	
	
	
}
