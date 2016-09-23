package it.uniroma3.icr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Job {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable = false)
	private int images;
	
	
	@Column(nullable=false)
	private double percentageType1;
	
	@Column(nullable=false)
	private double percentageType2;
	
	@Column(nullable=false)
	private double percentageType3;
	
	@ManyToOne
	private Symbol symbol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImages() {
		return images;
	}

	public void setImages(int images) {
		this.images = images;
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
	
	
	
	
	
}
