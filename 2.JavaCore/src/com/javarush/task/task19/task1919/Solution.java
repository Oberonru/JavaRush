package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Считаем зарплаты
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя значение
 * где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
 * <p>
 * Для каждого имени посчитать сумму всех его значений.
 * Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
 * Закрыть потоки.
 * <p>
 * Пример входного файла:
 * Петров 2
 * Сидоров 6
 * Иванов 1.35
 * Петров 3.1
 * <p>
 * Пример вывода:
 * Иванов 1.35
 * Петров 5.1
 * Сидоров 6.0
 * <p>
 * <p>
 * Требования:
 * 1. Программа НЕ должна считывать данные с консоли.
 * 2. Программа должна считывать содержимое файла (используй FileReader).
 * 3. Поток чтения из файла (FileReader) должен быть закрыт.
 * 4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть
 * отсортированы в возрастающем порядке по имени.
 * Считаем зарплаты
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            String[] ars = reader.readLine().split(" ");
            String key = ars[0];
            double value = Double.parseDouble(ars[1]);
            if (map.containsKey(key)) {
                map.put(key, value + map.get(key));
            } else map.put(key, value);
        }
        fileReader.close();
        reader.close();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
