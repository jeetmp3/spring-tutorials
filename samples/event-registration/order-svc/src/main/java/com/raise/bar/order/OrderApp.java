package com.raise.bar.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jitendra Singh.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApp {

    public static void main( String[] args ) {
        SpringApplication.run( OrderApp.class, args );
    }
}
