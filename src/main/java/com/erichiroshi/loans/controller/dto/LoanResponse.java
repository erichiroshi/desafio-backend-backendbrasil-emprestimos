package com.erichiroshi.loans.controller.dto;

import com.erichiroshi.loans.domain.LoanType;

public record LoanResponse(
        LoanType type, 
        Double interestRate) {
}