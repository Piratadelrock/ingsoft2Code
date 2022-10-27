package com.mipresupuesto.personalbudget.dto;

public final class YearDTO {

	private String id;
	private int year;
	
	public YearDTO() {
		setId("");
		setYear(0);
	}
	
	public YearDTO(String id, int year) {
		
		setId(id);
		setYear(year);
		
	}
	
	public static final YearDTO create() {
		return new YearDTO();
	}
	
	public final String getId() {
		
		if (id == null ) {
			setId("");
		}
		return id;
	}
	public final int getYear() {
//		por ser un dato primitivo probablemente nunca lleguen nullos, por ser primitivo siempre tendra un valor cualquiera
//		es decir que se puede o no dejar, pero se busca que el programa quede lo mas limpio posible 
		if (year<0) {
			setYear(0);
		}
		return year;
	}
	public final void setId(final String id) {
//		if (id == null) {
//			setId("");
//		}
		this.id = id;
	}
	
	public final void setYear(final int year) {
		this.year = year;
	}
	
	
	
	
}
