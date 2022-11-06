package com.mipresupuesto.personalbudget.application.service.specification;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

public class createBudgetSpecification extends 
CompositeSpecification<BudgetDomain>{

	//objeto para traer la validacion si existe persona 
	
	CompositeSpecification<BudgetDomain> ExistPerson = new isExistPersonSpecification();
	
	CompositeSpecification<BudgetDomain> ExistYear = new isExistYearSpecification();

	@Override
	public boolean isSatisfiedBy(BudgetDomain t) {
		return ExistPerson.and(ExistYear).isSatisfiedBy(t);
	}

	

	


//		ExisteAno AND 
//		ExistePersona AND 
//		PresupuestoEsParaAnoSiguiente AND NOT 
//		ExistePresupuestoMismoAnoPersona THEN 
//		CrearPresupuesto
/*
 * 
   isUnderage
    .and(isWeekend)
    .or(isSenior)
    .isSatisfiedBy();

 * 
 */
	

}
