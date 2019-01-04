package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Удалить и вставить
 * 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
 * <p>
 * <p>
 * Требования:
 * 1. Объяви переменную типа список строк и сразу проинициализируй ee.
 * 2. Программа должна считывать 5 строк с клавиатуры.
 * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * 4. Программа должна выводить список на экран, каждое значение с новой строки.
 * Удалить и вставить
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listStr.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String end = listStr.get(listStr.size() - 1);
            listStr.remove(listStr.size() - 1);
            listStr.add(0, end);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(listStr.get(i));
        }
    }
}
