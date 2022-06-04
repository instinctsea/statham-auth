package com.hms.auth.provider.config;

import com.hms.auth.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ValidationException;

@Slf4j
@RestControllerAdvice
public class ExceptionAdviceHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ValidationException.class, IllegalArgumentException.class})
    public ResponseEntity<ResponseDto> handleValidationException(Throwable ex) {

        ex.printStackTrace();
        //log.error(ex.getStackTrace().toString());
        System.out.println("error:"+ex.getStackTrace().toString());
        ResponseDto responseDto=ResponseDto.fail(ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(responseDto);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> handleException(Throwable ex) {
        ex.printStackTrace();
        //log.error(ex.getStackTrace().toString());
        System.out.println("error:"+ex.getStackTrace().toString());
        ResponseDto responseDto=ResponseDto.fail(ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(responseDto);
    }
}
