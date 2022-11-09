package com.example.restservice;
public class Calculator {
    public static int Add(int a, int b){

        return CalculatorAction.ADD(a, b);
    }
    public static int Dif(int a, int b){

        return CalculatorAction.DIF(a, b);
    }
    public static int Div(int a, int b){

        return CalculatorAction.DIV(a, b);
    }
    public static int Mul(int a, int b){

        return CalculatorAction.MUL(a, b);
    }

}
