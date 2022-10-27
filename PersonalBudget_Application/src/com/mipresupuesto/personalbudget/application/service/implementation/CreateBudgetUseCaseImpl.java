package com.mipresupuesto.personalbudget.application.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.entityassambler.EntityAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
@Transactional
public final class CreateBudgetUseCaseImpl implements CreateBudgetUseCase{
	
	@Autowired
	private EntityAssembler<BudgetEntity, BudgetDomain> EntityAssembler;
	
	@Autowired
	private BudgetRepository budgetRepository;
	

	@Override
	public final void execute(BudgetDomain budget) {
		budgetRepository.save(EntityAssembler.assembleEntity(budget));
	}

}
