package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public class YearDomain {
	
	private  UUID id;
	private  int year;
	
	private YearDomain(final UUID id, int year) {
		setId(id);
		setYear(year);
	}

	public static YearDomain create(final UUID id, int year) {
		return new YearDomain(id,year);
	}

	public final UUID getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}

	private final void setId(final UUID id) {
		this.id = (id == null) ? UUID.randomUUID(): id;
		
	}

	private final void setYear(int year) {
		this.year = year;
	}
	
//	public static void main(String[] args) {
//		UUID miUUID = UUID.randomUUID();
//		String miUUIDString = miUUID.toString();
//		UUID otroUUID = UUID.fromString(miUUIDString);
//		
//		System.out.println(miUUID);
//		System.out.println(miUUIDString);
//		System.out.println(otroUUID);
//	}

	
	
}
