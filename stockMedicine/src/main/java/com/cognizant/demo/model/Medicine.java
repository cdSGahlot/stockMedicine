package com.cognizant.demo.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Medicine {
	
	@Id
	private String name;
	private String composition;
	private String targetailment;
	private LocalDate dateofexpiry;
	private int numberofstock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public String getTargetAilment() {
		return targetailment;
	}
	public void setTargetAilment(String targetailment) {
		this.targetailment = targetailment;
	}
	public LocalDate getDateOfExpiry() {
		return dateofexpiry;
	}
	public void setDateOfExpiry(String doe) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(doe, formatter);
		this.dateofexpiry = date;
	}
	public int getNumberOfStock() {
		return numberofstock;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberofstock = numberOfStock;
	}
	@Override
	public String toString() {
		return "Medicine [name = " + name + ", composition = " + composition + ", targetAilment = " + targetailment
				+ ", dateOfExpiry = " + dateofexpiry + ", numberOfStock = " + numberofstock + "]";
	}
	
}
