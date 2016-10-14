package it.uniroma3.icr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private int x;
	
	@Column
	private int y;
	
	@Column
	private int width;
	
	@Column
	private int height;
	
	@Column
	private String page;
	
	@Column
	private String manuscript;
	
	@Column
	private String type;
	
	@Column
	private String path;
	
	@ManyToOne
	private Symbol symbol;

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	public Sample() {
		
	}
	
	public Sample(int width,int height,int xImg, int yImg,
			
			String manuscript, String page,String type,String path) {
		this.width = width;
		this.height = height;
		this.x = xImg;
		this.y = yImg;
	this.manuscript = manuscript;
		this.page = page;
		this.type = type;
		this.path = path;
		
	}
	
	
	
	
	
}
