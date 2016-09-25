package it.uniroma3.icr.model;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ElementCollection
	Map<Long,Long> results;
	

	
	
	@Column(nullable=false)
	private String title;
	
	public Task() {
		
	}


	public Long getId() {
		return id;
	}

	public Map<Long, Long> getResults() {
		return results;
	}

	
	public void setResults(Map<Long, Long> results) {
		this.results = results;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(Long id) {
		this.id = id;
	}


	
	
	
	

	
	


	
	
	

}
