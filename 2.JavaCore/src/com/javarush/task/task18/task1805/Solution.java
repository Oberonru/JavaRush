package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/**
 * Сортировка байт
 * Ввести с консоли имя файла.
 * Считать все байты из файла.
 * Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
 * Вывести на экран.
 * Закрыть поток ввода-вывода.
 *
 * Пример байт входного файла:
 * 44 83 44
 *
 * Пример вывода:
 * 44 83
 *
 *
 * Требования:
 * 1. Программа должна считывать имя файла с консоли.
 * 2. Для чтения из файла используй поток FileInputStream.
 * 3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
 * 4. Данные в консоль должны выводится в одну строку.
 * 5. Поток чтения из файла должен быть закрыт.
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));
        Set<Integer> set = new TreeSet<>();
        while (fis.available() > 0) {
            set.add(fis.read());
        }
        fis.close();
        reader.close();
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.toArray()[i] + " ");
        }

    }
}
