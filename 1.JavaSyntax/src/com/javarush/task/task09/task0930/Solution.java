package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Задача по алгоритмам
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел).
 * Слова вывести в возрастающем порядке, числа - в убывающем.
 *
 * Пример ввода:
 * Вишня
 * 1
 * Боб
 * 3
 * Яблоко
 * 22
 * 0
 * Арбуз
 *
 * Пример вывода:
 * Арбуз
 * 22
 * Боб
 * 3
 * Вишня
 * 1
 * 0
 * Яблоко
 *
 *
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Программа должна выводить данные на экран.
 * 3. Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
 * 4. Выведенные числа должны быть упорядочены по убыванию.
 * 5. Метод main должен использовать метод sort.
 * 6. Метод sort должен использовать метод isGreaterThan.
 * 7. Метод sort должен использовать метод isNumber.
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {

            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
