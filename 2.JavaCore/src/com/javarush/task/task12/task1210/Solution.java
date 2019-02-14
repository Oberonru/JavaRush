package com.javarush.task.task12.task1210;

/**
 * Три метода и максимум
 * Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Класс Solution должен содержать четыре метода.
 * 3. Класс Solution должен содержать статический метод int max(int, int).
 * 4. Метод int max(int, int) должен возвращать максимальное из двух чисел типа int.
 * 5. Класс Solution должен содержать статический метод long max(long, long).
 * 6. Метод long max(long, long) должен возвращать максимальное из двух чисел типа long.
 * 7. Класс Solution должен содержать статический метод double max(double, double).
 * 8. Метод double max(double, double) должен возвращать максимальное из двух чисел типа double.
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int value1, int value2) {
        return value1 < value2 ? value2 : value1;
    }
    public static long max(long value1, long value2) {
        return value1 < value2 ? value2 : value1;
    }
    public static double max(double value1, double value2) {
        return value1 < value2 ? value2 : value1;
    }

}
