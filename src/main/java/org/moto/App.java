package org.moto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by Nahid on 4/14/2016.
 */

@SpringBootApplication
public class App {

    public static void main(String[] args) throws Exception{

        SpringApplication.run(App.class,args);
    }
}
