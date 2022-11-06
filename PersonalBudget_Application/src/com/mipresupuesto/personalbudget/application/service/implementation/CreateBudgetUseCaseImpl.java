package com.mipresupuesto.personalbudget.application.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.application.service.specification.implementation.AndSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
@Transactional
public  class CreateBudgetUseCaseImpl implements CreateBudgetUseCase{
	
	@Autowired
	private  EntityAssembler<BudgetEntity, BudgetDomain> entityAssembler;
	
	@Autowired
	private  BudgetRepository budgetRepository;
	

	@Override
	public  void execute(BudgetDomain budget) {
		
		budgetRepository.save(entityAssembler.assembleEntity(budget));
	}

}
