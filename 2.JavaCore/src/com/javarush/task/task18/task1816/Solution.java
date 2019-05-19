package com.javarush.task.task18.task1816;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Английские буквы
 * В метод main первым параметром приходит имя файла.
 * Посчитать количество букв английского алфавита, которое есть в этом файле.
 * Вывести на экран число (количество букв).
 * Закрыть потоки.
 *
 *
 * Требования:
 * 1. Считывать с консоли ничего не нужно.
 * 2. Создай поток чтения из файла, который приходит первым параметром в main.
 * 3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
 * 4. Нужно учитывать заглавные и строчные буквы.
 * 5. Поток чтения из файла должен быть закрыт.
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File(args[0]));
        int count = 0;
        while (fis.available() > 0) {
            int value = fis.read();
            if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
                count++;
            }
        }
        fis.close();
        System.out.println(count);
    }
}
