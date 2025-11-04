package com.erichiroshi.loans.controller.dto;

import lombok.Getter;

@Getter
public enum TypeLoan {

    PERSONAL(4, "personal"),
    GUARANTEED(3, "guaranteed"),
    CONSIGNMENT(2, "consignment");

    private int interestRate;
    private String description;

    private TypeLoan(int interestRate, String description) {
        this.interestRate = interestRate;
        this.description = description;
    }
}