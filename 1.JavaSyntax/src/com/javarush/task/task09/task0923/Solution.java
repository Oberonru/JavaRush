package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Гласные и согласные
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1. первая строка содержит только гласные буквы из введённой строки.
 * 2. вторая - только согласные буквы и знаки препинания из введённой строки.
 * Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 * Пример ввода:
 * Мама мыла раму.
 * <p>
 * Пример вывода:
 * а а ы а а у
 * М м м л р м .
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с клавиатуры.
 * 2. Программа должна выводить две строки.
 * 3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
 * 4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
 * 5. Каждая строка должна заканчиваться пробелом.
 * Гласные и согласные
 */

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String newText = text.replace(" ", "");

        ArrayList<Character> oneList = new ArrayList<>();
        ArrayList<Character> thwoList = new ArrayList<>();
        int count = 0;
        int count2 = 0;

        char[] textSymbol = newText.toCharArray();
        for (int i = 0; i < newText.length(); i++) {
            if (isVowel(textSymbol[i])) {
                oneList.add(textSymbol[i]);
                count++;
            }
        }
        for (int i = 0; i < newText.length(); i++) {
            if (!isVowel(textSymbol[i]) || textSymbol[i] == ',' || textSymbol[i] == '.') {
                thwoList.add(textSymbol[i]);
                count2++;
            }
        }
        for (int j = 0; j < count; j++) {
            System.out.print(oneList.get(j) + " ");
        }
        System.out.println();
        for (int i = 0; i < count2; i++) {
            System.out.print(thwoList.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}