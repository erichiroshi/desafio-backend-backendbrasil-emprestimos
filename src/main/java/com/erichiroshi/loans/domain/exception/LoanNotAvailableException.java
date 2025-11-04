package com.erichiroshi.loans.domain.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

import com.erichiroshi.loans.controller.exception.LoanException;

public class LoanNotAvailableException extends LoanException {

    @Override
    public ProblemDetail toProblemDetail() {

        ProblemDetail pb = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);

        pb.setTitle("Loan Not Available");

        pb.setProperty("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        return pb;
    }

}