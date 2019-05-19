package com.javarush.task.task18.task1819;

import java.io.*;

/**
 * Объединение файлов
 * Считать с консоли 2 имени файла.
 * В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
 * Закрыть потоки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна два раза считать имена файлов с консоли.
 * 2. Не используй в программе статические переменные.
 * 3. Для первого файла создай поток для чтения и считай его содержимое.
 * 4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
 * 5. Содержимое первого и второго файла нужно объединить в первом файле.
 * 6. Сначала должно идти содержимое второго файла, затем содержимое первого.
 * 7. Созданные для файлов потоки должны быть закрыты.
 * Объединение файлов
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fis1 = new FileInputStream(new File(fileName1));
        FileInputStream fis2 = new FileInputStream(new File(fileName2));
        byte[] bytes = new byte[fis1.available() + fis2.available()];

        while (fis1.available() > 0) {
            fis1.read(bytes, fis2.available(), fis1.available());
        }
        while (fis2.available() > 0) {
            fis2.read(bytes, 0, fis2.available());
        }
        fis1.close();
        fis2.close();
        FileOutputStream fos = new FileOutputStream(new File(fileName1));
        fos.write(bytes);
        fos.close();
    }
}
