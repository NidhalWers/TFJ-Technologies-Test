package com.nidhalteyeb.test.tfj.api.error.exceptions;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
public class IllegalPayloadArgumentException extends IllegalArgumentException {

    private ErrorCode code;

    public IllegalPayloadArgumentException(ErrorCode code, String s) {
        super(s);
        this.code = code;
    }

    public ErrorCode getCode() {
        return code;
    }
}
