package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

public final class PersonDomainBuilder {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
//	private String lastName;

	private String firstSurname;
	private String secondSurname;
	
	private PersonDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}

	private final UUID getId() {
		
		return id;
	}

	private final String getIdCard() {
		return idCard;
	}

	private final String getFirstName() {
		return firstName;
	}

	private final String getMiddleName() {
		return middleName;
	}

	private final String getFirstSurname() {
		return firstSurname;
	}

	private final String getSecondSurname() {
		return secondSurname;
	}

	public final PersonDomainBuilder setId(final UUID id) {
		this.id = (id == null) ? UtilUUID.DEFAULT_UUID: id;
		return this;
	}

	public final PersonDomainBuilder setIdCard(final String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim();
		return this;
	}

	public final PersonDomainBuilder setFirstName(final String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim();
		return this;
	}

	public final PersonDomainBuilder setMiddleName(final String middleName) {
		this.middleName = (middleName == null) ? "" : middleName.trim();
		return this;
	}

	public final PersonDomainBuilder setFirstSurname(final String firstSurname) {
		this.firstSurname = (firstSurname == null) ? "" : firstSurname.trim();
		return this;
	}

	public final PersonDomainBuilder setSecondSurname(final String secondSurname) {
		this.secondSurname = (secondSurname == null) ? "" : secondSurname.trim();
		return this;
	}
	
	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}
	
	public PersonDomain build() {
		return PersonDomain
				.create(getId(), getIdCard(), getFirstName(), 
						getMiddleName(), getFirstSurname(),getSecondSurname());
	}

}
