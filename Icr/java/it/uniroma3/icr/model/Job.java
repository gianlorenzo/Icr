package it.uniroma3.icr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Job {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	
	@Column(nullable = false)
	private int images;
	
	
	@Column(nullable=false)
	private double percentageType1;
	
	@Column(nullable=false)
	private double percentageType2;
	
	@Column(nullable=false)
	private double percentageType3;
	
	@Column(nullable=false)
	private int students;
	
	@ManyToOne
	private Symbol symbol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	
	
	
	
	
	
	
}
