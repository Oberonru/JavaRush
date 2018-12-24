package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Среднее арифметическое
 * Вводить с клавиатуры числа и вычислить среднее арифметическое.
 * Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
 * -1 не должно учитываться.
 *
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * 4
 * 5
 * -1
 * получим вывод
 * 2.8
 *
 * б) при вводе чисел
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double value = 0;
        int count = -1;
        double sum = 0;
        double result = 0;
        while (value != -1) {
            value = Double.parseDouble(reader.readLine());
            count++;
            sum += value;

        }
        System.out.println( (sum + 1) / count);
    }
}

