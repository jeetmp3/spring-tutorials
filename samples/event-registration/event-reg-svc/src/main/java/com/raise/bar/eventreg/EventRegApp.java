package com.raise.bar.eventreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jitendra Singh.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EventRegApp {

    public static void main( String[] args ) {
        SpringApplication.run( EventRegApp.class, args );
    }
}
