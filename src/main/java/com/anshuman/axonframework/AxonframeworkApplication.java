package com.anshuman.axonframework;

import com.anshuman.axonframework.command.api.exception.ProductServiceExceptionHandler;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AxonframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxonframeworkApplication.class, args);
    }

    @Autowired
    public void configure(EventProcessingConfigurer configurer) {
        configurer.registerListenerInvocationErrorHandler(
                "product", configuration -> new ProductServiceExceptionHandler()
        );
    }
}
