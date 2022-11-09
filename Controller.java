package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/calculation")
    public Calculation greeting(@RequestParam(value = "operation", defaultValue = "sum") String operation, @RequestParam(value = "firstNumber", defaultValue = "0") String firstNumber, @RequestParam(value = "secondNumber", defaultValue = "1") String secondNumber) {
        int a = Integer.parseInt(firstNumber);
        int b = Integer.parseInt(secondNumber);
        switch(operation){
            case "ADD": return new Calculation(counter.incrementAndGet(), Calculator.Add(a,b));
            case "DIV": return new Calculation(counter.incrementAndGet(), Calculator.Div(a,b));
            case "DIF": return new Calculation(counter.incrementAndGet(), Calculator.Dif(a,b));
            case "MUL": return new Calculation(counter.incrementAndGet(), Calculator.Mul(a,b));
            default: throw new ExceptionCalculator(operation);
        }
    }
}