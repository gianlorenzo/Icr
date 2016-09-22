package it.uniroma3.icr.model;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
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
	
	@ManyToMany
	private List<Symbol> symbols;
	
	
	
	@Column(nullable=false)
	private String title;
	
	public Task() {
		
	}

	public Task(Long id, String title,List<Symbol> symbols) {
		super();
		this.id = id;
		this.title = title;
		this.symbols = symbols;
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

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
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

	@Override
	public String toString() {
		return "Task [id=" + id + ", results=" + results + ", symbols=" + symbols + ", title=" + title + "]";
	}

	
	
	
	

	
	


	
	
	

}
