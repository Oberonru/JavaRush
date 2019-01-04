package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Продолжаем мыть раму
 * 1. Создай список из слов "мама", "мыла", "раму".
 * 2. После каждого слова вставь в список строку, содержащую слово "именно".
 * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. Объяви переменную типа список строк и сразу проинициализируй ee.
 * 3. Добавь в список слова: «мама», «мыла», «раму».
 * 4. После каждого слова добавь в список строку, содержащую слово «именно».
 * 5. Выведи элементы списка на экран, каждый с новой строки.
 * Продолжаем мыть раму
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listRama = new ArrayList<>();
        listRama.addAll(Arrays.asList("мама", "мыла", "раму"));
        for (int i = 1; i < listRama.size() + 1 ; i +=2) {
            listRama.add(i, "именно");
        }


        for (int i = 0; i < listRama.size(); i++) {
            System.out.println(listRama.get(i));
        }
    }
}
