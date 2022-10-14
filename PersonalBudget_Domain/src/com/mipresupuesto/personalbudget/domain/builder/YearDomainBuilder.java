package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.YearDomain;

public class YearDomainBuilder {
	private UUID id; 
	private int year;
	
	private YearDomainBuilder() {
		
		setId(UUID.randomUUID());
		setYear(0);
	}
	
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}

	public final YearDomainBuilder setId(UUID id) {
		this.id = (id == null) ? UUID.randomUUID(): id;
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}

	private final UUID getId() {
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
		YearDomain myYearTwo = YearDomainBuilder.get().setId(null).build();
		
		YearDomain myYearThree = YearDomainBuilder.get().setId(null).build();
		YearDomain myYearFour = YearDomainBuilder.get().build();
		YearDomain myYearFive = YearDomainBuilder.get().setYear(2020).setId(null).build();
		
	}
	
}
