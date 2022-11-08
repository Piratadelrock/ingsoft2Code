package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@Component
public final class BudgetDTOAssembler implements DTOAssembler<BudgetDTO, BudgetDomain>{

	@Override
	public BudgetDomain assembleDomain(BudgetDTO dto) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		
		if (dto != null) {
			domain = BudgetDomainBuilder.get()

					.build();
		}
		return domain;
	}

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
		BudgetDTO dto = new BudgetDTO();
		
		if (domain != null) {
			dto = 
			new BudgetDTO(

					);
				
		} 

		return dto;
	}



}
