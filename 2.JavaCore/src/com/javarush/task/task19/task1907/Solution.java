package com.javarush.task.task19.task1907;

import java.io.*;

/**
 * Считаем слово
 * Считать с консоли имя файла.
 * Файл содержит слова, разделенные знаками препинания.
 * Вывести в консоль количество слов "world", которые встречаются в файле.
 * Закрыть потоки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать имя файла с консоли (используй BufferedReader).
 * 2. BufferedReader для считывания данных с консоли должен быть закрыт.
 * 3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
 * 4. Поток чтения из файла (FileReader) должен быть закрыт.
 * 5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
 * Считаем слово
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            int count = 0;
            while (fileReader.ready()) {
                String[] line = fileReader.readLine().split("\\W");
                for (int i = 0; i < line.length; i++) {
                    if (line[i].equals("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
