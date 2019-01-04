package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Самые-самые
 * 1. Создай список строк.
 * 2. Добавь в него 10 строчек с клавиатуры.
 * 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 * Если таких строк несколько, то должны быть учтены самые первые из них.
 * 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
 * <p>
 * <p>
 * Требования:
 * 1. Объяви переменную типа список строк и сразу проинициализируй ee.
 * 2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
 * 3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
 * 4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
 * 5. Должна быть выведена только одна строка.
 * Самые-самые
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
        int min = arrayList.get(0).length();
        int max = arrayList.get(0).length();
        int res1 = 0;
        int res2 = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < min) {
                min = arrayList.get(i).length();
                res1 = i;
            }
            if (arrayList.get(i).length() > max) {
                max = arrayList.get(i).length();
                res2 = i;
            }
        }
        System.out.println(res1 > res2 ? arrayList.get(res2) : arrayList.get(res1));
    }
}
