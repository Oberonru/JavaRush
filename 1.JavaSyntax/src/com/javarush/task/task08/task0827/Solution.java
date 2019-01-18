package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Работа с датой
 * 1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала
 * года - нечетное число, иначе false
 * 2. String date передается в формате FEBRUARY 1 2013
 * Не забудьте учесть первый день года.
 *
 * Пример:
 * JANUARY 1 2000 = true
 * JANUARY 2 2020 = false
 *
 *
 * Требования:
 * 1. Программа должна выводить текст на экран.
 * 2. Класс Solution должен содержать два метода.
 * 3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
 * 4. Метод main() должен вызывать метод isDateOdd().
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date); //создание нового объекта даты на основе String data
        SimpleDateFormat ff = new SimpleDateFormat("D");//задаётся формат для даты,
        //"D"-номер дня в году
        int x = Integer.parseInt(ff.format(date1));// применяем формат к  дате
        //и преобразуем к типу int
        return x % 2 != 0;
    }
}
