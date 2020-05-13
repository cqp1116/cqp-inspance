package com.cqp.instance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CqpInspanceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CqpInspanceApplication.class, args);
    }

    /**
     * 实现configure
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CqpInspanceApplication.class);
    }
}
