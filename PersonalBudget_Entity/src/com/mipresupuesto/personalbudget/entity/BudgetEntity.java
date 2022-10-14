package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

public class BudgetEntity {
	
	private UUID id;
	private YearEntity year;
	private PersonEntity person;
	
	
	public BudgetEntity(YearEntity year, PersonEntity person) {
		
		setYear(new YearEntity());
		setPerson(new PersonEntity());
		
	}

	

	public final YearEntity getYear() {
		return year;
	}


	public final void setYear(YearEntity year) {
		this.year = year;
	}


	public final PersonEntity getPerson() {
		if (person == null) {
			setPerson(new PersonEntity());
		} 
		
		
		return person;
	}


	public final void setPerson(PersonEntity person) {
		this.person = person;
	}
	
	
	
	

}
