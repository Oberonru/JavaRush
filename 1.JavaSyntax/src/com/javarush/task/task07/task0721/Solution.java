package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Минимаксы в массивах
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 *
 *
 * Требования:
 * 1. Создай массив целых чисел (int[]) на 20 элементов.
 * 2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
 * 3. Найди и выведи через пробел максимальное и минимальное числа.
 * 4. Используй цикл for.
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        int maximum = array[array.length - 1];
        int minimum = array[0];
        System.out.print(maximum + " " + minimum);
    }
}
