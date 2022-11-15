package org.tk.domain.carros;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CarroNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(CarroNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String carroNotFoundHandler(CarroNotFoundException ex) {
        return ex.getMessage();
    }
}