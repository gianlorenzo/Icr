package it.uniroma3.icr.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ElementCollection
	Map<Long,Long> risultati;
	
	@ManyToMany
	private List<Simbolo> simboli;
	
	
	
	@Column(nullable=false)
	private String titolo;
	
	public Task() {
		
	}

	public Task(Long id, String titolo,List<Simbolo> simboli) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.simboli = simboli;
	}
	
	public Long getId() {
		return id;
	}
	
	
	

	public Map<Long, Long> getRisultati() {
		return risultati;
	}

	public void setRisultati(Map<Long, Long> risultati) {
		this.risultati = risultati;
	}

	public List<Simbolo> getSimboli() {
		return simboli;
	}

	public void setSimboli(List<Simbolo> simboli) {
		this.simboli = simboli;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", descrizione=" + titolo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}
	


	
	
	

}
