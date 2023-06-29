package org.example;

public class Task02 {
    public static void main(String[] args) {
        int[] array = {4, 8, 16, 24, 128, 32, 256, 512};
        int[] array2 = {2, 0, 4, 4, 0, 8};
        try { //Внешинй блок
            for (int i = 0; i < array.length; i++) {
                try { //Внутренний блок
                    System.out.println(array[i] + " / " + array2[i] + " = " + array[i] / array2[i]);
                } catch (ArithmeticException ex) {
                    System.out.println("Попытка деления на ноль");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Элемент не найден");
            System.out.println("Фатальная ошибка");
        }
    }
}

