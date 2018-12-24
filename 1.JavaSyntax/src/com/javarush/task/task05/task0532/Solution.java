package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.
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

        System.out.println(arr(array));


    }
    public static int arr(int[] array)
    {
        int max = array[0];
        for( int i = 0; i < array.length; i ++)
        {
        if( array[i] > max )
            max = array[i];
        }
        return  max;
    }
}
