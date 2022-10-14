package com.mipresupuesto.personalbudget.dto;

public class PersonalDTO {

	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstsurname;
	private String secondSurname;

	
	private String Name;
	private String lastName;
	private String completeName;
	
	private PersonalDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		
		setFirstsurname("");
		setSecondSurname("");
		setName("");
		setLastName("");
		setCompleteName("");
		
	}
	
//	@SuppressWarnings("unchecked") 
	@SuppressWarnings("all")
	public PersonalDTO(
			final String id,
			final String idCard, 
			final String firstName, 
			final String middleName, 
			final String firstsurname,
			final String secondSurname,
			final String Name,
			final String lastName,
			final String completeName
			
			) {
		
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setLastName("");
	
	}
	public static final PersonalDTO create() {
		return new PersonalDTO();
	}
	


	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getIdCard() {
		return idCard;
	}
	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final String getMiddleName() {
		return middleName;
	}
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public final String getLastName() {
		return lastName;
	}
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public final String getFirstsurname() {
		return firstsurname;
	}

	public final void setFirstsurname(String firstsurname) {
		this.firstsurname = firstsurname;
	}

	public final String getSecondSurname() {
		return secondSurname;
	}

	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public final String getName() {
		return Name;
	}

	public final void setName(String name) {
		Name = name;
	}

	public final String getCompleteName() {
		return completeName;
	}

	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	
}
