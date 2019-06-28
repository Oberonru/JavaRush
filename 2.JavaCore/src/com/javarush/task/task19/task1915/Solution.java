package com.javarush.task.task19.task1915;

import java.io.*;

/**
 * Дублируем текст
 * Считай с консоли имя файла.
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
 * Вызови готовый метод printSomething(), воспользуйся testString.
 * Верни переменной System.out первоначальный поток.
 * Закрой поток файла.
 * <p>
 * Пример вывода на экран:
 * it's a text for testing
 * <p>
 * Пример тела файла:
 * it's a text for testing
 * <p>
 * <p>
 * Требования:
 * 1. Класс Solution должен содержать класс TestString.
 * 2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу
 * проинициализировано.
 * 3. Класс TestString должен содержать публичный void метод printSomething().
 * 4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
 * 5. В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
 * 6. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
 * 7. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c
 * конструктором принимающим ByteArrayOutputStream).
 * 8. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта
 * System.out.
 * 9. Метод main(String[] args) класса Solution должен один раз вызвать метод printSomething() объекта testString.
 * 10. Метод main(String[] args) класса Solution должен выводить и в консоль и в файл строку выведенную методом
 * printSomething() (используй FileOutputStream).
 * 11. Поток записи в файл (FileOutputStream) должен быть закрыт.
 * Дублируем текст
 */

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileOutputStream fos = new FileOutputStream(new File(fileName));

        PrintStream outputStream = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);

        System.setOut(printStream);
        testString.printSomething();
        System.setOut(outputStream);
        fos.write(baos.toByteArray());
        fos.close();
        System.out.println(baos.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

