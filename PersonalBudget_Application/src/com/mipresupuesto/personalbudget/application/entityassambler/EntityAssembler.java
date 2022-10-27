package com.mipresupuesto.personalbudget.application.entityassambler;

public interface EntityAssembler<E, D>{
	
	D assembleDomain(E entity);
	
	E assembleEntity(D domain);
}
