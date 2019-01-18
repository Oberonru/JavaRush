package com.javarush.task.task08.task0814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Больше 10? Вы нам не подходите
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Класс Solution должен содержать только три метода.
 * 4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
 * 5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() throws Exception {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add(i);
        }
        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
               set.removeIf(x -> x > 10);
           }

        return set;
    }

    public static void main(String[] args) {

    }
}
