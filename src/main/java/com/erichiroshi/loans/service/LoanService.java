package com.erichiroshi.loans.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.erichiroshi.loans.controller.dto.CustomerLoanRequest;
import com.erichiroshi.loans.controller.dto.CustomerLoanResponse;
import com.erichiroshi.loans.controller.dto.LoanResponse;
import com.erichiroshi.loans.domain.Customer;
import com.erichiroshi.loans.domain.Loan;
import com.erichiroshi.loans.domain.LoanType;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvailability(CustomerLoanRequest loanRequest) {

        Customer customer = loanRequest.toCustomer();
        Loan loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isConsigmentLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsigmentLoanInterestRate()));
        }

        if (loan.isGuaranteedLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }

        return new CustomerLoanResponse(loanRequest.name(), loans);
    }
}