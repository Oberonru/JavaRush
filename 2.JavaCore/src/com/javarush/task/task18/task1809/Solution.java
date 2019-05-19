package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Реверс файла
 * Считать с консоли 2 имени файла: файл1, файл2.
 * Записать в файл2 все байты из файл1, но в обратном порядке.
 * Закрыть потоки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна два раза считать имена файлов с консоли.
 * 2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
 * 3. Во второй файл нужно записать все байты из первого в обратном порядке.
 * 4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 * Реверс файла
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));
        FileOutputStream fos = new FileOutputStream(new File(reader.readLine()));
        ArrayList<Integer> list = new ArrayList<>();
        while (fis.available() > 0) {
            list.add(fis.read());
        }
        Collections.reverse(list);
        for (Integer element : list) {
            fos.write(element);
        }
        reader.close();
        fis.close();
        fos.close();
    }
}
