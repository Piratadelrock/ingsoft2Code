package com.mipresupuesto.personalbudget.application.service.specification;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;


public class isExistPersonSpecification extends CompositeSpecification<BudgetDomain>{
	
	
	@Override
	public boolean isSatisfiedBy(BudgetDomain budget) {
		return budget.getPerson() != null;
	}

}
