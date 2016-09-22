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
public class Immagine {

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
	private String pagina;
	
	@Column(nullable = false)
	private String manoscritto;
	
	@Column(nullable=false)
	private String tipo;
	
	@ManyToMany
	private List<Task> tasks;

	public Immagine(Long id, int x, int y, int width, int height, String pagina, String manoscritto, String tipo) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.pagina = pagina;
		this.manoscritto = manoscritto;
		this.tipo = tipo;
		this.tasks = new ArrayList<>();
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

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public String getManoscritto() {
		return manoscritto;
	}

	public void setManoscritto(String manoscritto) {
		this.manoscritto = manoscritto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Immagine [id=" + id + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", pagina="
				+ pagina + ", manoscritto=" + manoscritto + ", tipo=" + tipo + ", tasks=" + tasks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((manoscritto == null) ? 0 : manoscritto.hashCode());
		result = prime * result + ((pagina == null) ? 0 : pagina.hashCode());
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + width;
		result = prime * result + x;
		result = prime * result + y;
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
		Immagine other = (Immagine) obj;
		if (height != other.height)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (manoscritto == null) {
			if (other.manoscritto != null)
				return false;
		} else if (!manoscritto.equals(other.manoscritto))
			return false;
		if (pagina == null) {
			if (other.pagina != null)
				return false;
		} else if (!pagina.equals(other.pagina))
			return false;
		if (tasks == null) {
			if (other.tasks != null)
				return false;
		} else if (!tasks.equals(other.tasks))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (width != other.width)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	
}
