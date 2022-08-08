package com.nidhalteyeb.test.tfj.api.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Nidhal TEYEB
 * @since 0.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResource {

    private String code;

    private String message;
}
