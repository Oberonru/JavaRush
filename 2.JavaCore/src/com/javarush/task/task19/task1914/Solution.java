package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Решаем пример
 * В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
 * Твоя ридер-обертка должна выводить на консоль решенный пример.
 * Вызови готовый метод printSomething(), воспользуйтесь testString.
 * Верни переменной System.out первоначальный поток.
 * <p>
 * Возможные операции: + - *
 * Шаблон входных данных и вывода: a [знак] b = c
 * Отрицательных и дробных чисел, унарных операторов - нет.
 * <p>
 * Пример вывода:
 * 3 + 6 = 9
 * <p>
 * <p>
 * Требования:
 * 1. Класс Solution должен содержать класс TestString.
 * 2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу
 * проинициализировано.
 * 3. Класс TestString должен содержать публичный void метод printSomething().
 * 4. Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
 * 5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром
 * конструктора ByteArrayOutputStream).
 * 6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта
 * System.out.
 * 7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
 * 8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething()
 * согласно заданию, и выводить её в консоль.
 */

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream outputStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();
        String[] resultArray = result.split(" ");
        System.setOut(outputStream);
        int num1 = Integer.parseInt(resultArray[0]);
        int num2 = Integer.parseInt(resultArray[2]);
        if (resultArray[1].equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        if (resultArray[1].equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        if (resultArray[1].equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

