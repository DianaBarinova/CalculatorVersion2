package com.example.restservice;

public class CalculatorAction {
    public static int ADD(int a, int b) {
        int answer = a + b;
        return answer;
    }

    public  static int DIF(int a, int b) {
        int answer = a - b;
        return answer;
    }

    public static int MUL(int a, int b) {
        int answer = a * b;
        return answer;
    }

    public static int DIV(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException();
        }

            int answer = a / b;

        return answer;
    }


}
