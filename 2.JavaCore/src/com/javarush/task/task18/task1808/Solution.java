package com.javarush.task.task18.task1808;

import java.io.*;

/**
 * Разделение файла
 * Считать с консоли три имени файла: файл1, файл2, файл3.
 * Разделить файл1 по следующему критерию:
 * Первую половину байт записать в файл2, вторую половину байт записать в файл3.
 * Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
 * Закрыть потоки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна три раза считать имена файлов с консоли.
 * 2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
 * 3. Первую половину байт из первого файла нужно записать во второй файл.
 * 4. Вторую половину байт из первого файла нужно записать в третий файл.
 * 5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 * Разделение файла
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream fis = new FileInputStream(new File(file1));
        FileOutputStream fos2 = new FileOutputStream(new File(file2));
        FileOutputStream fos3 = new FileOutputStream(new File(file3));
        byte[] byteArray = new byte[fis.available()];
        if (fis.available() > 0) {
            int count = fis.read(byteArray);
            fos2.write(byteArray, 0, (count + 1) / 2);
            fos3.write(byteArray, (count + 1) / 2, count / 2);
        }
        reader.close();
        fis.close();
        fos2.close();
        fos3.close();
    }
}
