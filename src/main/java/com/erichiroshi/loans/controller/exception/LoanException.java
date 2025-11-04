package com.erichiroshi.loans.controller.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class LoanException extends RuntimeException {

    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);

        pb.setTitle("Loan internal server error");

        pb.setProperty("timestamp", LocalDateTime.now());

        return pb;
    }
}
