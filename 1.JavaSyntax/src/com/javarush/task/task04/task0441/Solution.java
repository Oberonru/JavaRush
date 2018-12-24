package com.javarush.task.task04.task0441;


/**
 * Как-то средненько
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 * Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 *
 *
 * Требования:
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(reader.readLine());
      int b = Integer.parseInt(reader.readLine());
      int c = Integer.parseInt(reader.readLine());
      int[] array = {a, b, c};
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
