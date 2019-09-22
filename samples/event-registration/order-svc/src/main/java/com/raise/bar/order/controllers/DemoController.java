package com.raise.bar.order.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jitendra Singh.
 */
@RestController
public class DemoController {

    @GetMapping( "/hello" )
    public String hello( ) {
        return "Hello";
    }

}
