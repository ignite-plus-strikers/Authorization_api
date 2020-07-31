package com.tgt.strikers.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ScorerNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ScorerNotFoundException(String message) {
        super(message);
    }
}