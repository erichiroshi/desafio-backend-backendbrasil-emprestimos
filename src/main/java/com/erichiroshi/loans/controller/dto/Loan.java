package com.erichiroshi.loans.controller.dto;

import java.util.List;

public record Loan(
        Customer customer,
        List<TypeLoan> loans) {
}