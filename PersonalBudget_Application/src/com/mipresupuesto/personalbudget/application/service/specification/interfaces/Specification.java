package com.mipresupuesto.personalbudget.application.service.specification.interfaces;

public interface Specification<T> {
    boolean isSatisfiedBy(T t);
}