package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Один большой массив и два маленьких
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 *
 *
 * Требования:
 * 1. Программа должна создавать большой массив на 20 целых чисел.
 * 2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
 * 3. Программа должна создавать два маленьких массива на 10 чисел каждый.
 * 4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести его на экран.
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        int[] secondArray = new int[10];
        int[] therddArray = new int[10];

        secondArray = Arrays.copyOf(bigArray, 10);
        therddArray = Arrays.copyOfRange(bigArray, 10, 20);
        for (int i = 0; i < therddArray.length; i++) {
            System.out.println(therddArray[i]);
        }


    }
}
