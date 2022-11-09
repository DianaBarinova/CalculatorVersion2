package com.example.restservice;

public class Calculation {

    private final long id;
    private final double answer;
    public Calculation(long id, double answer) {
        this.id = id;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public double getAnswer() {
        return answer;
    }
}