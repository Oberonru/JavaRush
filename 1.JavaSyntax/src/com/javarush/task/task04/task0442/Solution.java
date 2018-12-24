package com.javarush.task.task04.task0442;


/**
 * Суммирование
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 * <p>
 * Подсказака: один из вариантов решения этой задачи, использовать конструкцию:
 * <p>
 * while (true) {
 * int number = считываем число;
 * if (проверяем, что number -1)
 * break;
 * }
 * <p>
 * Требования:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * 3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * 4. В программе должен использоваться цикл for, while или do-while.
 * Суммирование
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean isCompleate = false;
        while (!isCompleate) {
            int value = Integer.parseInt(reader.readLine());
            if (value == -1) {
                isCompleate = true;
            }
            sum += value;
        }
        System.out.println(sum);
    }
}
