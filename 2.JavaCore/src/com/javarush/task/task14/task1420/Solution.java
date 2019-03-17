package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * НОД
 * Наибольший общий делитель (НОД).
 * Ввести с клавиатуры 2 целых положительных числа.
 * Вывести в консоль наибольший общий делитель.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать с клавиатуры 2 строки.
 * 2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
 * НОД
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            if (x <= 0 || y <= 0) {
                throw new Exception();
            }

            while (x != 0 && y != 0) {
                if (x > y) {
                    x = x % y;
                } else {
                    y = y % x;
                }
            }
            System.out.println(x + y);
        }
    }


