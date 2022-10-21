package com.mipresupuesto.personalbudget.application.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.application.usecase.entityassambler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

public class CreateBudgetUseCaseImpl implements CreateBudgetUseCase{
	
	@Autowired
	private EntityAssembler<BudgetEntity, BudgetDomain> EntityAssembler;
	
	@Autowired
	private BudgetRepository budgetRepository;
	

	@Override
	public void execute(BudgetDomain budget) {
		budgetRepository.save(EntityAssembler.assembleEntity(budget));
	}

}
