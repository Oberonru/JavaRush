package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Cамая длинная последовательность
 * 1. Создай список чисел.
 * 2. Добавь в список 10 чисел с клавиатуры.
 * 3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 * <p>
 * Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
 * 3
 * <p>
 * Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна выводить число на экран.
 * 2. Программа должна считывать значения с клавиатуры.
 * 3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
 * 4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
 * 5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
 * Cамая длинная последовательность
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        ArrayList<Integer> counter = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                counter.add(count);
            } else count = 1;
        }
        Collections.sort(counter);
        if (!counter.isEmpty()) {

            System.out.println(counter.get(counter.size() - 1));
        }
        else System.out.println(1);
    }
}
