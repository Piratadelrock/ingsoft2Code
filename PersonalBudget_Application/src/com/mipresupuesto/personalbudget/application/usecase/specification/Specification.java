package com.mipresupuesto.personalbudget.application.usecase.specification;

public interface Specification<T> {
    boolean isSatisfiedBy(T t);
}