package com.german.restapivalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.german.restapivalidation.controller.BookController;
import com.german.restapivalidation.controller.Controller;

@SpringBootApplication 
public class App 
{
	
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
