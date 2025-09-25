package com.digitalwallet.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DigitalwalletBackendApplication extends SpringBootServletInitializer{
  public static void main(String[] args) {
    SpringApplication.run(DigitalwalletBackendApplication.class, args);
    System.out.println("Digital Wallet  API is Running");
  }
}
