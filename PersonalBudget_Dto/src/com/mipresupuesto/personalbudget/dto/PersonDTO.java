package com.mipresupuesto.personalbudget.dto;

public final class PersonDTO {

	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstsurname;
	private String secondSurname;

	
	private String Name;
	private String lastName;
	private String completeName;
	
	private PersonDTO() {
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
	public PersonDTO(
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
	public static final PersonDTO create() {
		return new PersonDTO();
	}
	


	
	public final String getId() {
		if (id == null || "".equals(id.trim())) {
			setId("");
		}
		return id;
	}
	public final void setId(final String id) {
		this.id = id;
	}
	public final String getIdCard() {
		if (idCard == null || "".equals(idCard.trim())) {
			setIdCard("");
		}
		return idCard;
	}
	public final void setIdCard(final String idCard) {
		this.idCard = idCard;
	}
	public final String getFirstName() {
		if (firstName == null || "".equals(firstName.trim())) {
			setFirstName("");
		}
		return firstName;
	}
	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public final String getMiddleName() {
		if (middleName == null || "".equals(middleName.trim())) {
			setMiddleName("");
		}
		return middleName;
	}
	public final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}
	public final String getLastName() {
		if (lastName == null || "".equals(lastName.trim())) {
			setLastName("");
		}
		return lastName;
	}
	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	
	public final String getFirstsurname() {
		if (firstsurname == null || "".equals(firstsurname.trim())) {
			setFirstsurname("");
		}
		return firstsurname;
	}

	public final void setFirstsurname(final String firstsurname) {
		this.firstsurname = firstsurname;
	}

	public final String getSecondSurname() {
		if (secondSurname == null || "".equals(secondSurname.trim())) {
			setSecondSurname("");
		}
		return secondSurname;
	}

	public final void setSecondSurname(final String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public final String getName() {
		if (Name == null || "".equals(Name.trim())) {
			setName("");
		}
		return Name;
	}

	public final void setName(String name) {
		Name = name;
	}

	public final String getCompleteName() {
		if (completeName == null || "".equals(completeName.trim())) {
			setCompleteName("");
		}
		return completeName;
	}

	public final void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	
}
