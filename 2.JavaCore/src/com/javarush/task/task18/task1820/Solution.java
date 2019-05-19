package com.javarush.task.task18.task1820;

import java.io.*;

/**
 * Округление чисел
 * Считать с консоли 2 имени файла.
 * Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
 * Округлить числа до целых и записать через пробел во второй файл.
 * Закрыть потоки.
 * <p>
 * Принцип округления:
 * 3.49 => 3
 * 3.50 => 4
 * 3.51 => 4
 * -3.49 => -3
 * -3.50 => -3
 * -3.51 => -4
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна два раза считать имена файлов с консоли.
 * 2. Для первого файла создай поток для чтения. Для второго - поток для записи.
 * 3. Считать числа из первого файла, округлить их и записать через пробел во второй.
 * 4. Должны соблюдаться принципы округления, указанные в задании.
 * 5. Созданные для файлов потоки должны быть закрыты.
 * Округление чисел
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new File(reader.readLine()));
        BufferedWriter fos = new BufferedWriter(new FileWriter(new File(reader.readLine())));
        reader.close();

        byte[] buffer = new byte[fis.available()];

        if (fis.available() > 0) {
            fis.read(buffer);
        }
        String bufferString = new String(buffer);
        String[] splitedString = bufferString.split(" ");

        for (String element : splitedString) {
            float value = Float.parseFloat(element);
            int roundedValue = Math.round(value);
            fos.write(roundedValue + " ");
        }

        reader.close();
        fis.close();
        fos.close();
    }
}
