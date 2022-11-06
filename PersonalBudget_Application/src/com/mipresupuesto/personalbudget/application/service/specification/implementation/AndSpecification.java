package com.mipresupuesto.personalbudget.application.service.specification.implementation;

import com.mipresupuesto.personalbudget.application.service.specification.interfaces.Specification;

public class AndSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> left;
    private final Specification<T> right;

    public AndSpecification(Specification<T> pLeft, Specification<T> pRight) {
        this.left = pLeft;
        this.right = pRight;
    }

    public boolean isSatisfiedBy(T t) {
        return left.isSatisfiedBy(t) && right.isSatisfiedBy(t);
    }
}