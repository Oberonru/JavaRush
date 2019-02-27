package com.javarush.task.task13.task1326;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Сортировка четных чисел из файла
 * 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 * <p>
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 * <p>
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с консоли.
 * 2. Программа должна создавать FileInputStream для введенной с консоли строки.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
 * 5. Программа должна закрывать поток чтения из файла(FileInputStream).
 * Сортировка четных чисел из файла
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inStream));

        ArrayList<Integer> list = new ArrayList<>();
        String line = "";

        while ((line = fileReader.readLine()) != null) {
            int date = Integer.parseInt(line);
            if (date % 2 == 0) list.add(date);
        }

        inStream.close();
        fileReader.close();
        reader.close();

        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
