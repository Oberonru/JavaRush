package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Самый богатый
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя значение
 * где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
 * <p>
 * Для каждого имени посчитать сумму всех его значений.
 * Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
 * Имена разделять пробелом либо выводить с новой строки.
 * Закрыть потоки.
 * <p>
 * Пример входного файла:
 * Петров 0.501
 * Иванов 1.35
 * Петров 0.85
 * <p>
 * Пример вывода:
 * Петров
 * <p>
 * <p>
 * Требования:
 * 1. Программа НЕ должна считывать данные с консоли.
 * 2. Программа должна считывать содержимое файла (используй FileReader).
 * 3. Поток чтения из файла (FileReader) должен быть закрыт.
 * 4. Программа должна выводить в консоль имена, у которых максимальная сумма.
 * Самый богатый
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);
        Map<String, Double> map = new TreeMap<>();
        while (reader.ready()) {
            String[] stringArray = reader.readLine().split(" ");
            String key = stringArray[0];
            double value = Double.parseDouble(stringArray[1]);
            if (map.containsKey(key)) {
                map.put(key, value + map.get(key));
            } else {
                map.put(key, value);
            }

        }
        double max = Collections.max(map.values());
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() == max) {
                System.out.println(pair.getKey());
            }
        }
        fileReader.close();
        reader.close();
    }
}
