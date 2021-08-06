package com.vvkt.bssvedu;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
//(scanBasePackages = "com.vvkt.bssvedu.*")
public class BssveduappApplication extends SpringBootServletInitializer {
	
private static Class applicationClass = BssveduappApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(BssveduappApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}