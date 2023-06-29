package org.example;

public class Main {


    public static void main(String[] args) {
//        System.out.println(divide(10, 0));
//        a();


    }

    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Devide by zero not permited");
        }
        return a1 / a2;
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[100]);
    }
}