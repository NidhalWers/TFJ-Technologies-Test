package com.nidhalteyeb.test.tfj.api.error;

import com.nidhalteyeb.test.tfj.api.error.exceptions.ErrorCode;
import com.nidhalteyeb.test.tfj.api.error.exceptions.IllegalPayloadArgumentException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.nidhalteyeb.test.tfj.Application.LOGGER;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = IllegalPayloadArgumentException.class)
    public ResponseEntity<ErrorResource> illegalPayloadArgumentHandler(IllegalPayloadArgumentException exception) {
        LOGGER.error(String.format("%s %s Stacktrace : %s", exception.getMessage(), exception.getCause(), ExceptionUtils.getStackTrace(exception)));
        return new ResponseEntity<>(new ErrorResource(exception.getCode().getValue(), exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
