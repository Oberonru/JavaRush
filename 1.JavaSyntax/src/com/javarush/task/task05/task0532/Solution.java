package com.javarush.task.task05.task0532;

import java.io.*;

/**
 * Задача по алгоритмам
 * Написать программу, которая:
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 *
 *
 * Требования:
 * 1. Программа должна считывать числа с клавиатуры.
 * 2. Программа должна выводить число на экран.
 * 3. В классе должен быть метод public static void main.
 * 4. Нельзя добавлять новые методы в класс Solution.
 * 5. Программа должна выводить на экран максимальное из введенных N чисел.
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int [] array = new int[n];
        for ( int i = 0; i < array.length; i ++)
        {
            int m = Integer.parseInt(reader.readLine());
            array[i]  = m;
        }
        int max = array[0];
        for( int i = 0; i < array.length; i ++)
        {
            if( array[i] > max )
                max = array[i];
        }

        System.out.println(max);

    }

}
