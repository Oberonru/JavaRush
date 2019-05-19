package com.javarush.task.task15.task1507;

/**
 * ООП - Перегрузка
 * Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
 *
 *
 * Требования:
 * 1. В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
 * 2. Класс Solution должен быть public.
 * 3. Все методы класса Solution должны быть статическими.
 * 4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix() {

    }
    public static void printMatrix(int m) {

    }
    public static void printMatrix(int m, int n) {

    }
    public static void printMatrix(int m, int n, int value) {

    }
    public static void printMatrix(String m, int n, int value) {

    }
    public static void printMatrix(String m, String n, int value) {

    }
    public static void printMatrix(Integer m, String n, int value) {

    }
    public static void printMatrix(Integer m, Integer n, int value) {

    }

}
