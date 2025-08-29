package com.timecapsule.timecapsule;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeCapsuleNotFoundAdvice {

    @ExceptionHandler(TimeCapsuleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String timeCapsuleNotFoundHandler(TimeCapsuleNotFoundException e){
        return e.getMessage();
    }
}
