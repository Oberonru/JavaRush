package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Считаем слово
 * Считать с консоли имя файла.
 * Файл содержит слова, разделенные знаками препинания.
 * Вывести в консоль количество слов "world", которые встречаются в файле.
 * Закрыть потоки.
 *
 *
 * Требования:
 * 1. Программа должна считывать имя файла с консоли (используй BufferedReader).
 * 2. BufferedReader для считывания данных с консоли должен быть закрыт.
 * 3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
 * 4. Поток чтения из файла (FileReader) должен быть закрыт.
 * 5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        List<String> list = new ArrayList<>();
        FileReader fileReader = new FileReader(fileName);
        while (fileReader.ready()) {
            list.add(String.valueOf(fileReader.read()));
        }

    }
}
