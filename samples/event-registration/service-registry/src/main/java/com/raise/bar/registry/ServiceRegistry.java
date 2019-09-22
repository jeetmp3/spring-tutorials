package com.raise.bar.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Jitendra Singh.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistry {

    public static void main( String[] args ) {
        SpringApplication.run( ServiceRegistry.class, args );
    }
}
