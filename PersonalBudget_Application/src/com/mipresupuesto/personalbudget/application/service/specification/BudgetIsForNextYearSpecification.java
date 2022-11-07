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
	
	
	@Override
	public boolean isSatisfiedBy(BudgetDomain budget) {
		
		
		Optional<BudgetEntity> budgetIsForNextYear = budgetRepository
				.findByPersonAndYear(budget.getPerson().getId(),budget.getYear().getId());
				
		if(existYearBudget.isPresent()) {
			return true;
		}

		return false;
	}

}
