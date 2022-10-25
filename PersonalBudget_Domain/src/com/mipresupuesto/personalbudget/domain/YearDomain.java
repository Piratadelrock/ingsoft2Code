package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public final class YearDomain {
	
	private  UUID id;
	private  int year;
	
	private YearDomain(final UUID id, final int year) {
		setId(id);
		setYear(year);
	}

	public static YearDomain create(final UUID id, final int year) {
		return new YearDomain(id,year);
	}

	private final void setId(final UUID id) {
		this.id = (id == null) ? UUID.randomUUID(): id;
		
	}

	private final void setYear(final int year) {
		this.year = year;
	}
	
	public final UUID getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}


// se ejecuta desde esta pestaña 	
//	public static void main(String[] args) {
//		UUID miUUID = UUID.randomUUID();
//		String miUUIDString = miUUID.toString();
//		UUID otroUUID = UUID.fromString(miUUIDString);
//		
//		System.out.println(miUUID);
//		System.out.println(miUUIDString.replace("0","z");
//		System.out.println(otroUUID);
//	}

	
	
}
