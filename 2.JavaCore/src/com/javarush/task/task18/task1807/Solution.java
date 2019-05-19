package com.javarush.task.task18.task1807;

import java.io.*;

/**
 * Подсчет запятых
 * С консоли считать имя файла.
 * Посчитать в файле количество символов ',', количество вывести на консоль.
 * Закрыть потоки.
 *
 * Подсказка:
 * нужно сравнивать с ascii-кодом символа ','.
 *
 *
 * Требования:
 * 1. Программа должна считывать имя файла с консоли.
 * 2. Для чтения из файла используй поток FileInputStream.
 * 3. В консоль должно выводится число запятых в считанном файле.
 * 4. Поток чтения из файла должен быть закрыт.
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));
        int count = 0;
        while (fis.available() > 0) {
            int value = fis.read();
            if (value == 44) {
                count++;
            }
        }
        reader.close();
        fis.close();
        System.out.println(count);

    }
}
