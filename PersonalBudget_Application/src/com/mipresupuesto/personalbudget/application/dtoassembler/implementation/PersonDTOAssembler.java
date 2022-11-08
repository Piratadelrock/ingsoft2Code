package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.dto.PersonDTO;
import com.mipresupuesto.personalbudget.dto.YearDTO;


public final class PersonDTOAssembler implements DTOAssembler<PersonDTO, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonDTO dto) {
		
	PersonDomain domain = PersonDomainBuilder.get().build();
		
		if (dto != null) {
			domain = PersonDomainBuilder.get()					
					.setId(UtilUUID.getUUIDFromString(dto.getId()))
					.setIdCard(dto.getIdCard())
					.setFirstName(dto.getFirstName())
					.setLastName(dto.getLastName())
					.setFirstSurname(dto.getFirstsurname())
					.setSecondSurname(dto.getSecondSurname())
					.build();
			
		}
		return domain;
	}

	@Override
	public PersonDTO assembleDTO(PersonDomain domain) {
		
		PersonDTO dto = new PersonDTO(null, null, null, null, null);
		
		if (domain != null) {
			dto = new YearDTO(UtilUUID
					.getStringFromUUID(domain.getId()),domain.getYear());
		} 
		

		return dto;
	}
	
	


	
}
