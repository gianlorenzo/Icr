package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.transaction.TransactionScoped;

@Entity
public class Symbol {
	
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String transcription;
	
	@Column(nullable=false)
	private String type;
	
	@OneToMany(mappedBy="symbol")
	private List<Job> jobs;
	
	
	public Symbol() {
		
	}

	public Symbol(Long id, String transcription,String type) {
		super();
		this.id = id;
		this.transcription = transcription;
		this.type = type;
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
