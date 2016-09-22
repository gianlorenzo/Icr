package it.uniroma3.icr.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.transaction.TransactionScoped;

@Entity
public class Simbolo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String trascrizione;
	
	@Column(nullable=false)
	private String tipo;
	
	@ManyToMany(mappedBy="simboli")
	List<Task> tasks;
	
	
	public Simbolo() {
		
	}

	public Simbolo(Long id, String trascrizione,String tipo) {
		super();
		this.id = id;
		this.trascrizione = trascrizione;
		this.tipo = tipo;
	}
	
	

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrascrizione() {
		return trascrizione;
	}

	public void setTrascrizione(String trascrizione) {
		this.trascrizione = trascrizione;
	}

	

	@Override
	public String toString() {
		return "Simbolo [id=" + id + ", trascrizione=" + trascrizione + ", tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((trascrizione == null) ? 0 : trascrizione.hashCode());
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
		Simbolo other = (Simbolo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (trascrizione == null) {
			if (other.trascrizione != null)
				return false;
		} else if (!trascrizione.equals(other.trascrizione))
			return false;
		return true;
	}

	
	

}
