package com.raise.bar.event.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jitendra Singh.
 */
@RestController
public class TestController {

    @GetMapping
    public String test() {
        return "Event Svc";
    }
}
