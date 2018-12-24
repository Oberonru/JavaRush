package com.javarush.task.task04.task0428;

/**
 * оложительное число
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
 *
 * Примеры:
 * а) при вводе чисел
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int value = Integer.parseInt(reader.readLine());
            if (value > 0) count++;
        }
        System.out.println(count);


    }
}
