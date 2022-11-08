package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.entity.PersonEntity;

@Component
public class PersonEntityAssembler implements EntityAssembler<PersonEntity, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonEntity entity) {
		
		PersonDomain domain = PersonDomainBuilder.get().build();
		
		if(entity != null) {
			domain = PersonDomainBuilder.get()
					.setId(entity.getId())
					.setIdCard(entity.getIdCard())
					.setFirstName(entity.getFirstName())
					.setLastName(entity.getLastName())
					.setMiddleName(entity.getMiddleName())
			
					.build();
		}
		
	
		return domain;
	}
	
	@Override
	public PersonEntity assembleEntity(PersonDomain domain) {
		
		PersonEntity entity = new PersonEntity();
		
		if(domain != null) {
			entity = new PersonEntity(
					domain.getId(),
					domain.getIdCard(),
					domain.getFirstName(),
					domain.getMiddleName(),
					domain.getLastName(),
					domain.getFirstSureName(),
					domain.getSecondSureName());
		}
		return entity;
	}
}
