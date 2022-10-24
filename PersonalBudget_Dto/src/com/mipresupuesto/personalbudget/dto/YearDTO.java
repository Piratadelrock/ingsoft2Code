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
		
		if (id == null || "".equals(id.trim())) {
			setId("");
		}
		return id;
	}
	public final int getYear() {
//		se puede dejar o no pero se quita porque normalmente no es necesario revisar cabezas 
//		if (year<0) {
//			setYear(0);
//		}
		return year;
	}
	public final void setId(String id) {
		if (id == null) {
			setId("");
		}
		this.id = id;
	}
	public final void setYear(int year) {
		
		this.year = year;
	}
	
	
	
	
}
