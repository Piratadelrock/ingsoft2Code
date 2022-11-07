package com.mipresupuesto.personalbudget.dto;

public final class PersonDTO {

	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;

//	el dominio recibe el resto pero no recibe ninguno de los siguientes 
	private String Name;
	private String lastName;
	private String completeName;

	private PersonDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setLastName("");
		
//		setFirstsurname("");
//		setSecondSurname("");
//
//		setName("");
//		
//		setCompleteName("");

	}

//	@SuppressWarnings("unchecked") 
	@SuppressWarnings("all")
	public PersonDTO(
			final String id, 
			final String idCard, 
			final String firstName, 
			final String middleName,
//			final String firstsurname, 
//			final String secondSurname,
//			final String Name, 
			final String lastName
//			final String completeName
			) {

		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
//		setFirstsurname(firstsurname);
//		setSecondSurname(secondSurname);
//
//		setName(Name);
		setLastName(lastName);
//		setCompleteName(completeName);

	}




	public static final PersonDTO create() {
		return new PersonDTO();
	}

	public final String getId() {
		if (id == null) {
			setId("");
		}
		return id.trim();
	}

	public final void setId(final String id) {
		this.id = id;
	}

	public final String getIdCard() {
		if (idCard == null) {
			setIdCard("");
		}
		return idCard.trim();
	}

	public final void setIdCard(final String idCard) {
		this.idCard = idCard;
	}

	public final String getFirstName() {
		if (firstName == null) {
			setFirstName("");
		}
		return firstName;
	}

	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public final String getMiddleName() {
		if (middleName == null) {
			setMiddleName("");
		}
		return middleName.trim();
	}

	public final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}
	public final String getLastName() {
		if (lastName == null ) {
			setLastName("");
		}
		return lastName.trim();
	}
	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public final String getFirstsurname() {
		if (firstSurname == null) {
			setFirstsurname("");
		}
		return firstSurname.trim();
	}

	public final void setFirstsurname(final String firstsurname) {
		this.firstSurname = firstsurname;
	}

	public final String getSecondSurname() {
		if (secondSurname == null) {
			setSecondSurname("");
		}
		return secondSurname.trim();
	}

	public final void setSecondSurname(final String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public final String getName() {
		if (Name == null) {
			setName("");
		}
		return Name.trim();
	}

	public final void setName(final String name) {
		Name = name;
	}

	public final String getCompleteName() {
		if (completeName == null) {
			setCompleteName("");
		}
		return completeName.trim();
	}

	public final void setCompleteName(final String completeName) {
		this.completeName = completeName;
	}

}
