package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public final class PersonDomain {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
//	private String lastName;
	private String firstSureName;
	private String secondSureName;

	private PersonDomain(
			final UUID id, 
			final String idCard, 
			final String firstName, 
			final String middleName,
			final String firstSureName, 
			final String secondSureName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSureName(firstSureName);
		setSecondSureName(secondSureName);

	}

	public static PersonDomain create(final UUID id, final String idCard, final String firstName,
			final String middleName, final String firstSureName, final String secondSureName) {
		return new PersonDomain(id, idCard, firstName, middleName, firstSureName, secondSureName);

	}

	private final void setId(final UUID id) {

		this.id = (id == null) ? UUID.randomUUID() : id;

	}

	private final void setIdCard(final String idCard) {
//		this.idCard = idCard;
//		this.idCard = (idCard == null) ? PersonDomainBuilder.get(): idCard;
		this.idCard = (idCard == null) ? "" : idCard;
	}

	private final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	private final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	private void setFirstSureName(final String firstSureName) {
		this.firstSureName = firstSureName;
	}

	private void setSecondSureName(final String secondSureName) {
		this.secondSureName = secondSureName;
	}

//	GETTERS
	public final UUID getId() {
		return id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final String getFirstSureName() {
		return firstSureName;
	}

	public final String getSecondSureName() {
		return secondSureName;
	}
	public final String getName() {
		return (getFirstName() + " " + getMiddleName()).trim();
	}
	
	public final String getLastName() {
		return (getFirstSureName() + " " + getSecondSureName()).trim();
	}

	public final String getCompleteName() {
		return (getName() + " " + getLastName()).trim();
	}

	
	
}
