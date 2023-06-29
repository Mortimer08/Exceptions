package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            myInput(-1);

        } catch (MyException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Finally block execution");
        }
    }

    public static void myInput(int value) throws MyException {
        if (value < 0) {
//            throw new MyException("Value can not be negative");
            MyException n = new MyException("Text");
            throw n;
        }
        System.out.println("Working text value " + value);
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}