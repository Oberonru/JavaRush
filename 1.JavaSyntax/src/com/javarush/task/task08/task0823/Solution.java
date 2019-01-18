package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Омовение Рамы
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа заменяет в тексте первые буквы всех слов на заглавные.
 * Вывести результат на экран.
 * <p>
 * Пример ввода:
 * мама мыла раму.
 * <p>
 * Пример вывода:
 * Мама Мыла Раму.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна выводить текст на экран.
 * 2. Программа должна считывать строку с клавиатуры.
 * 3. Класс Solution должен содержать один метод.
 * 4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
 * Омовение Рамы
 * <p>
 * <p>
 * <p>
 * Можно решить без массивов, с созданием новой строки и использованием цикла for, в котором по-итерационно в новую
 * строку добавлять каждый символ и осуществлять проверку является ли пробелом предыдущий символ. Если предыдущий
 * символ является пробелом, то текущий символ переводить к верхнему регистру и также прибавлять к новой строке.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] charString = s.toCharArray();
        String newS = "";
        charString[0] = Character.toUpperCase(charString[0]);
        for (int i = 0; i < s.length(); i++) {
            if (charString[i] == ' ') {
                charString[i + 1] = Character.toUpperCase(charString[i + 1]);
            }
        }
        String s1 = new String(charString);
        System.out.println(s1);
    }
}

