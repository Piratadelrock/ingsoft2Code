package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;

@Component
public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity, BudgetDomain>{

	
	@Override
	public BudgetDomain assembleDomain(BudgetEntity entity) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		
		if(entity != null) {
			domain = BudgetDomainBuilder.get()
					.setId(entity.getId())
					.build();
		}

		return domain;
	}

	@Override
	public BudgetEntity assembleEntity(BudgetDomain domain) {
		BudgetEntity entity = new BudgetEntity();
			
			if(domain != null) {
				entity = new BudgetEntity();
						
			}
			return entity;
	}


}
