package com.javarush.task.task04.task0423;

/**
 * Фейс-контроль
 * Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
 * Фейс-контроль
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        if (a > 20) System.out.println("И 18-ти достаточно");
    }
}