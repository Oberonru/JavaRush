package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Четные символы
 * Считать с консоли 2 имени файла.
 * Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
 * <p>
 * Пример первого файла:
 * text in file
 * Вывод во втором файле:
 * eti ie
 * Закрыть потоки ввода-вывод
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
 * 2. BufferedReader для считывания данных с консоли должен быть закрыт.
 * 3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
 * 4. Поток чтения из файла (FileReader) должен быть закрыт.
 * 5. Программа должна записывать во второй файл все байты из первого файла с четным порядковым номером (используй FileWriter).
 * 6. Поток записи в файл (FileWriter) должен быть закрыт.
 * Четные символы
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        List<Integer> list = new ArrayList<>();
        while (fileReader.ready()) {
            list.add(fileReader.read());
        }
        fileReader.close();
        for (int i = 1; i <= list.size(); i += 2) {
            fileWriter.write(list.get(i));
        }
        fileWriter.close();
    }
}
