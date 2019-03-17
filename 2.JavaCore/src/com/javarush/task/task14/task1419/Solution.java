package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Нашествие исключений
 * Заполни список exceptions десятью(10) различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 * <p>
 * <p>
 * Требования:
 * 1. Список exceptions должен содержать 10 элементов.
 * 2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
 * 3. Все элементы списка exceptions должны быть уникальны.
 * 4. Метод initExceptions должен быть статическим.
 * Нашествие исключений
 */

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = {1, 2, 3};
            array[3] = 4;
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sdfsdf"));
            String s = reader.readLine();
            System.out.println(s);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = "2/3";
            int x = Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String first = null;
            String second = first.toUpperCase();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> list = new ArrayList<>();
            int x = list.get(12);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object[] o = "a;b;c".split(";");
            o[0] = 42;
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> os = new ArrayList<>();
            Object o = new Object();
            os.add(String.valueOf(o));

        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[-10];
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalStateException("MyException");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
    }
}
