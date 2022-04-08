package com.example.yelpdemo;

import com.example.yelpdemo.beans.YelpError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class BusinessNotFoundAdvice {

    @ExceptionHandler(BusinessNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    YelpError businessNotFoundHandler(BusinessNotFoundException ex) {

        return new YelpError("BUSINESS_NOT_FOUND",
                "The requested business could not be found.", ex.getMessage());

    }

}
