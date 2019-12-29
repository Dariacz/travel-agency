package com.daria.travelagency.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class IllegalFieldException extends RuntimeException {
    public IllegalFieldException() {
    }
}
