package com.simple_calculator;

public class Operation {

    public double addition(double n1, double n2) {
        return n1 + n2;
    }

    public double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        return n1 / n2;
    }

    public double choice(int i, double n1, double n2) {
        double answer = 0;
        switch (i) {
            case 1:
                answer = addition(n1, n2);
                break;
            case 2:
                answer = subtraction(n1, n2);
                break;
            case 3:
                answer = multiplication(n1, n2);
                break;
            case 4:
                answer = division(n1, n2);
                break;
            default:
                throw new AssertionError();
        }
        return answer;
    }
}
