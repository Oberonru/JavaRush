package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Консоль-копилка
 * Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
 * Вывести на экран полученную сумму.
 * <p>
 * Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit",
 * можно с помощью следующей конструкции:
 * <p>
 * BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
 * while (true)
 * {
 * String s = buffer.readLine();
 * if (s.equals("exit"))
 * break;
 * }
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в
 * нижнем регистре и нажмет Enter.
 * 3. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
 * 4. Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
 * 5. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
 * 6. Программа должна выводить текст на экран.
 * Консоль-копилка
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String value = reader.readLine();
            if (value.equals("сумма")) {
                break;
            }
            //теперь нам нужно привести строку к числу
            int count = Integer.parseInt(value);
            sum += count;
        }
        System.out.println(sum);
    }
}

