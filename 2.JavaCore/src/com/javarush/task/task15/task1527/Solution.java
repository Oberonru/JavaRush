package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Парсер реквестов
 * Считать с консоли URL-ссылку.
 * Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
 * URL содержит минимум 1 параметр.
 * Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
 * Если присутствует параметр obj, то передать его значение в нужный метод alert.
 * alert(double value) - для чисел (дробные числа разделяются точкой)
 * alert(String value) - для строк
 * Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
 * <p>
 * Пример 1
 * <p>
 * Ввод:
 * http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 * <p>
 * Вывод:
 * lvl view name
 * <p>
 * Пример 2
 * <p>
 * Ввод:
 * http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 * <p>
 * Вывод:
 * obj name
 * double: 3.14
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать с клавиатуры только одну строку.
 * 2. Класс Solution не должен содержать статические поля.
 * 3. Программа должна выводить данные на экран в соответствии с условием.
 * 4. Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj может быть
 * корректно преобразовано в число типа double.
 * 5. Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj НЕ может быть
 * корректно преобразовано в число типа double.
 * Парсер реквестов
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
           alert(value);
        }
        else alert(scanner.next());
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
