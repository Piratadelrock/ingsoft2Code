package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.dto.PersonDTO;


public final class PersonDTOAssembler implements DTOAssembler<PersonDTO, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonDTO dto) {
		
	PersonDomain domain = PersonDomainBuilder.get().build();
		
		if (dto != null) {
			domain = PersonDomainBuilder.get()					
					.setId(UtilUUID.getUUIDFromString(dto.getId()))
					.setIdCard(dto.getIdCard())
					.setFirstName(dto.getFirstName())
					.setFirstSurname(dto.getFirstsurname())
					.setSecondSurname(dto.getSecondSurname())
					.build();
			
		}
		return domain;
	}

	@Override
	public PersonDTO assembleDTO(PersonDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	
}
