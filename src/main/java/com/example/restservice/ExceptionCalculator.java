package com.example.restservice;

public class ExceptionCalculator extends RuntimeException {
    ExceptionCalculator (String operation){
        super("Could not find operation " + operation);
    }
}
