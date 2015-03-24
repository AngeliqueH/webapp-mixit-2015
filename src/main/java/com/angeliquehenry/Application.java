package com.angeliquehenry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application permettant l'execution sur springboot.
 * Les annotation sont scannées automatiquement à partir de cette arborescence de package.
 * @author Angélique Henry
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
