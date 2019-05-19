package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Самые частые байты
 * Ввести с консоли имя файла.
 * Найти байт или байты с максимальным количеством повторов.
 * Вывести их на экран через пробел.
 * Закрыть поток ввода-вывода.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать имя файла с консоли.
 * 2. Для чтения из файла используй поток FileInputStream.
 * 3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
 * 4. Данные в консоль должны выводится в одну строку.
 * 5. Поток чтения из файла должен быть закрыт.
 * Самые частые байты
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(new File(reader.readLine()));

        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        reader.close();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    map.put(list.get(i), Collections.frequency(list, list.get(i)));
                    break;
                }
            }
        }
        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == max) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
