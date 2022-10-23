package com.mipresupuesto.personalbudget.application.entityassambler;

public interface EntityAssembler<T, D>{
	
	D assembleDomain(T entity);
	
	T assembleEntity(D domain);
}
