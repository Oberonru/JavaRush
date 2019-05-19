package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Самые редкие байты
 * Ввести с консоли имя файла.
 * Найти байт или байты с минимальным количеством повторов.
 * Вывести их на экран через пробел.
 * Закрыть поток ввода-вывода.
 *
 *
 * Требования:
 * 1. Программа должна считывать имя файла с консоли.
 * 2. Для чтения из файла используй поток FileInputStream.
 * 3. В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
 * 4. Данные в консоль должны выводится в одну строку.
 * 5. Поток чтения из файла должен быть закрыт.
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));
        List<Integer> list = new ArrayList<>();
        while (fis.available() > 0) {
            list.add(fis.read());
        }
        reader.close();
        fis.close();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : list) {
            map.put(element, Collections.frequency(list, element));
        }
        int min = Collections.min(map.values());

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == min) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
