package org.example;

class SimpleCalculator {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int result = Calculator.divide(a, b);
            System.out.println("Result = " + result);
        } catch (DivisionByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}

class DivisionByZeroException extends Exception {
    DivisionByZeroException(String message) {
        super(message);
    }
}

class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is prohibited");
        }
        return a / b;
    }
}