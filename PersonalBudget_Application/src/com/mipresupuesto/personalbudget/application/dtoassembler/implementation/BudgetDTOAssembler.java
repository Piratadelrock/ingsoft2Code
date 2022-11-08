package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@Component
public final class BudgetDTOAssembler 
implements DTOAssembler<BudgetDTO, BudgetDomain>{

	@Override
	public BudgetDomain assembleDomain(BudgetDTO dto) {
		
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		
		if (dto != null) {
			domain = BudgetDomainBuilder.get()
					.setPerson(dto.getPerson().getId())
					
					.build();
	
		}

		return domain;
	}

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}



}
