package com.mipresupuesto.personalbudget.domain;

public class YearDomain {
	private  String id;
	private  int year;
	
	private YearDomain(String id, int year) {
		setId(id);
		setYear(year);
	}

	public static YearDomain create(String id, int year) {
		return new YearDomain(id,year);
	}

	public final String getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}

	private final void setId(String id) {
		this.id = id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

	
	
}
