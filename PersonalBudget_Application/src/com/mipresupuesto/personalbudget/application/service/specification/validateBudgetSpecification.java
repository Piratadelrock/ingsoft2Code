package com.mipresupuesto.personalbudget.application.service.specification;

import org.springframework.beans.factory.annotation.Autowired;

import com.mipresupuesto.personalbudget.application.service.specification.implementation.CompositeSpecification;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;

public class validateBudgetSpecification extends CompositeSpecification<BudgetDomain> {

	@Autowired
	isExistPersonSpecification ExistPerson;
	
	@Autowired
	isExistYearSpecification ExistYear;
	
	


	@Override
	public boolean isSatisfiedBy(BudgetDomain t) {
//		ExistPerson y ExistYear parecido al caso de uso, y si se hace lo del caso de uso solo llamar esta especificacion
		
		
		return false;
	}


}




//CompositeSpecification<PersonDomain> ExistPerson = new isExistPersonSpecification();
//CompositeSpecification<BudgetDomain> ExistYear = new isExistYearSpecification();
//
//CompositeSpecification<BudgetDomain> PresupuestoEsParaAnoSiguiente = new isPresupuestoEsParaAnoSiguienteSpecification();
//CompositeSpecification<BudgetDomain> ExistePresupuestoMismoAnoPersona = new isPresupuestoaMismoAnoPersonaSpecification();

// objeto para traer la validacion si existe persona


//ExisteAno AND ExistePersona 
//AND 
//PresupuestoEsParaAnoSiguiente 
//AND NOT 
//ExistePresupuestoMismoAnoPersona THEN 
//CrearPresupuesto
/*
* 
* isUnderage .and(isWeekend) .or(isSenior) .isSatisfiedBy();
* 
* 
*/
