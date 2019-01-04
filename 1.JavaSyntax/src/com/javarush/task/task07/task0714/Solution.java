package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Слова в обратном порядке
 * Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 *
 *
 * Требования:
 * 1. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
 * 2. Считай 5 строк с клавиатуры и добавь их в список.
 * 3. Удали третий элемент списка.
 * 4. Выведи элементы на экран, каждый с новой строки.
 * 5. Порядок вывода должен быть обратный.
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        strings.remove(2);
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}


