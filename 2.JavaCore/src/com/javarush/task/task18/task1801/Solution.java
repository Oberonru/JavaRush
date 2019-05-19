package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Максимальный байт
 * Ввести с консоли имя файла.
 * Найти максимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 *
 *
 * Требования:
 * 1. Программа должна считывать имя файла с консоли.
 * 2. Для чтения из файла используй поток FileInputStream.
 * 3. В консоль должен выводиться максимальный байт, считанный из файла.
 * 4. Поток чтения из файла должен быть закрыт.
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File fileName = new File(reader.readLine());
        FileInputStream fileInputStream = new FileInputStream(fileName);

        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        Integer max =  Collections.max(list);
        System.out.println(max);
    }
}
