package com.mipresupuesto.personalbudget.application.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.application.service.specification.isExistBudgetEqualYearPersonSpecification;
import com.mipresupuesto.personalbudget.application.service.specification.isExistPersonSpecification;
import com.mipresupuesto.personalbudget.application.service.specification.isExistYearSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
@Transactional
public  class CreateBudgetUseCaseImpl implements CreateBudgetUseCase{
	
	@Autowired
	private  EntityAssembler<BudgetEntity, BudgetDomain> entityAssembler;
	
	@Autowired
	private  BudgetRepository budgetRepository;
	
	@Autowired
	isExistPersonSpecification existPersonS;
	
	@Autowired
	isExistYearSpecification existYearS;
	
	@Autowired
	isExistBudgetEqualYearPersonSpecification existBudgetEqualYearPersonS;
//	existe persona y año actuales
//	
	
	
	@Override
	public  void execute(BudgetDomain budget) {
		boolean existPerson = existPersonS.isSatisfiedBy(budget.getPerson());
		boolean existYear = existYearS.isSatisfiedBy(budget.getYear());
		
		boolean existBudgetEqualYearPerson = existBudgetEqualYearPersonS.isSatisfiedBy(budget);
		
//		ExisteAno AND ExistePersona 
//		AND PresupuestoEsParaAnoSiguiente 
//		AND NOT ExistePresupuestoMismoAnoPersona 
//		THEN CrearPresupuesto
		if(existPerson && existYear && !existBudgetEqualYearPerson) {
			
			budgetRepository.save(entityAssembler.assembleEntity(budget));
		}
		
	}


}
