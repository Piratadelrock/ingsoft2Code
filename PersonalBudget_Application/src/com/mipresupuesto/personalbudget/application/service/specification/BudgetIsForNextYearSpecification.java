package com.mipresupuesto.personalbudget.application.service.specification;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.infrastructure.repository.interfaces.BudgetRepository;

@Service
//isPresupuestoEsParaAnoSiguienteSpecification = Budget Is For Next Year
public class BudgetIsForNextYearSpecification extends CompositeSpecification<BudgetDomain>{
	

	@Autowired
	private BudgetRepository budgetRepository;
	@Autowired
	isExistBudgetEqualYearPersonSpecification existBudgetYearPerson;
	
	
	@Override
	public boolean isSatisfiedBy(BudgetDomain budget) {
	
//		Optional<BudgetEntity> budgetIsForNextYear = budgetRepository.findById(budget.getId());
		
//		Optional<BudgetEntity> budgetId = budgetRepository.findById(budget.getId());
		
//		Optional<BudgetEntity> budgetIdYear = budgetRepository.findAllById(null);
		
		
//		existBudgetYearPerson.isSatisfiedBy(budget)
		/*
		 * 
		 * PresupuestoEsParaAnoSiguiente 
		 * idBudget 
		 * 
		 * person and year == year 
		 * 
		 * si es igual a este y este otro entonces manda true, o false entonces con esto tendriamos si el año es o no es permitido crear
		 * */
		
//		Optional<BudgetEntity> budgetExistPerson = 
//				budgetRepository
//				.findByPersonAndYear(budget.getPerson().getId(), budget.getYear().getId());
//
//				
//		if(budgetIsForNextYear.isPresent()) {
//			return true;
//		}
//
		return false;
	}

}
