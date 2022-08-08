package com.nidhalteyeb.test.tfj.api;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("webmvc")
@WebMvcTest
@ComponentScan(basePackages = {
        "com.nidhalteyeb.test.tfj.application"
})
public @interface CustomWebMvcTest {

}
