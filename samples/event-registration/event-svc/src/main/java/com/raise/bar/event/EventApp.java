package com.raise.bar.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jitendra Singh.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EventApp {

    public static void main( String[] args ) {
        SpringApplication.run( EventApp.class, args );
    }
}
