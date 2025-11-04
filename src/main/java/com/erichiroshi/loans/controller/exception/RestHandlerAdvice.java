package com.erichiroshi.loans.controller.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.erichiroshi.loans.domain.exception.LoanNotAvailableException;

@ControllerAdvice
public class RestHandlerAdvice {

    @ExceptionHandler(LoanNotAvailableException.class)
    public ProblemDetail handleLoanException(LoanNotAvailableException e) {
        return e.toProblemDetail();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        List<InvalidParam> fieldErros = e.getFieldErrors()
                .stream()
                .map(f -> new InvalidParam(f.getField(), f.getDefaultMessage()))
                .toList();

        ProblemDetail pb = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);

        pb.setTitle("Your request parameters didn't validate.");
        pb.setProperty("invalid-params", fieldErros);

        return pb;
    }

    private record InvalidParam(String error, String message) {
    }

}
