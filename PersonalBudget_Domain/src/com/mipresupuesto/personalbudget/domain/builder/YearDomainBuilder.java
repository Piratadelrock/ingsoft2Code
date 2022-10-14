package com.mipresupuesto.personalbudget.domain.builder;

import com.mipresupuesto.personalbudget.domain.YearDomain;

public class YearDomainBuilder {
	private String id; 
	private int year;
	
	private YearDomainBuilder() {
		
		setId("");
		setYear(0);
	}
	
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}

	public final YearDomainBuilder setId(String id) {
		
		this.id = (id==null) ? "": id.trim();
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}

	private final String getId() {
		return id;
	}

	private final int getYear() {
		return year;
	}
	
	
	//con este metodo se esta creando un yeardomain
	public YearDomain build() {
		return YearDomain.create(getId(), getYear()); 
	}
	
	public static void main(String[] args) {
		//construir los domain el builder es el que se cargo con la logica de creacion
		
		
		YearDomain myYear = YearDomainBuilder.get().setYear(2020).build();
		YearDomain myYearTwo = YearDomainBuilder.get().setId("123").build();
		
		YearDomain myYearThree = YearDomainBuilder.get().setId("123").build();
		YearDomain myYearFour = YearDomainBuilder.get().build();
		YearDomain myYearFive = YearDomainBuilder.get().setYear(2020).setId("123").build();
		
	}
	
}
