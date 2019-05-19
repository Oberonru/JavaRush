package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Минимальный байт
 * Ввести с консоли имя файла.
 * Найти минимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 *
 *
 * Требования:
 * 1. Программа должна считывать имя файла с консоли.
 * 2. Для чтения из файла используй поток FileInputStream.
 * 3. В консоль должен выводиться минимальный байт, считанный из файла.
 * 4. Поток чтения из файла должен быть закрыт.
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        Integer min = Collections.min(list);
        System.out.println(min);
    }
}
