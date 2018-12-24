package com.javarush.task.task04.task0429;

/**
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество
 * отрицательных чисел в исходном наборе, в следующем виде:
 * "количество отрицательных чисел: а", "количество положительных чисел: б",
 * где а, б - искомые значения.
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countPlus = 0;
        int countMinus = 0;
        for ( int i  = 0; i < 3; i ++)
        {
            int number = Integer.parseInt(reader.readLine());

            if ( number > 0) countPlus++;
            else if  (number < 0 ) countMinus++;
        }
        System.out.println("количество положительных чисел: " + countPlus);
        System.out.println("количество отрицательных чисел: " + countMinus);

    }
}
