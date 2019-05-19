package com.javarush.task.task18.task1818;

import java.io.*;

/**
 * Два в одном
 * Считать с консоли 3 имени файла.
 * Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
 * Закрыть потоки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна три раза считать имена файлов с консоли.
 * 2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
 * 3. Содержимое второго файла нужно переписать в первый файл.
 * 4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
 * 5. Созданные для файлов потоки должны быть закрыты.
 * Два в одном
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream fos1 = new FileOutputStream(new File(fileName1));

        FileInputStream fis2 = new FileInputStream(new File(fileName2));
        FileInputStream fis3 = new FileInputStream(new File(fileName3));
        while (fis2.available() > 0) {
            fos1.write(fis2.read());
        }
        while (fis3.available() > 0) {
            fos1.write(fis3.read());
        }
        reader.close();
        fos1.close();
        fis2.close();
        fis3.close();
    }
}
