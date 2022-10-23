package com.mipresupuesto.personalbudget.dto;



public class BudgetDTO {

	private YearDTO year;
	private PersonalDTO person;
	
	
	
	public BudgetDTO(YearDTO year, PersonalDTO person) {
		setYear(year);
		setPerson(person);
	 }


	public BudgetDTO() {
		setYear(YearDTO.create());
		setPerson(PersonalDTO.create());
		

	}
	
	
	public final YearDTO getYear() {
		
		return year;
	} 
	public final void setYear(YearDTO year) {
		this.year = year;
	}
	
	public final PersonalDTO getPerson() {
	if (person==null) {
			setPerson(PersonalDTO.create());
		
		}
		return person;
	}
	public final void setPerson(PersonalDTO person) {
		this.person = person;
	}
	
	
	
	
}
