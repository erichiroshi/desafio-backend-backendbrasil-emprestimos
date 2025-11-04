package com.erichiroshi.loans.controller.dto;

import java.math.BigDecimal;

public record Customer(
        Long age,
        String cpf,
        String name,
        BigDecimal income,
        String location) {
}