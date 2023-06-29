package org.example;

public class Task03 {
    static void GenException() {
        int[] nums = new int[4];
        System.out.println("До генерации исключения");
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}

class UseTask03 {
    public static void main(String[] args) {
        try {
            Task03.GenException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Стандартное сообщение");
            System.out.println(ex);
            System.out.println("Стек вызовов");
            ex.printStackTrace();

        }
        System.out.println("После оператора Catch");
    }
}
