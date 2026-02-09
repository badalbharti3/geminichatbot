package org.example.geminicall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class GeminicallApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeminicallApplication.class, args);
    }

}
