package com.example.exception;

import java.time.LocalDateTime;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice

public class GlobalExceptionHandler {

@ExceptionHandler(StudentNotFoundException.class)

public ResponseEntity<ErrorResponse> handleStudent(StudentNotFoundException ex){

ErrorResponse error=new ErrorResponse(

LocalDateTime.now(),

ex.getMessage(),

404

);

return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

}


@ExceptionHandler(InvalidInputException.class)

public ResponseEntity<ErrorResponse> handleInput(InvalidInputException ex){

ErrorResponse error=new ErrorResponse(

LocalDateTime.now(),

ex.getMessage(),

400

);

return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);

}

}