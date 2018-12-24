package com.javarush.task.task04.task0427;
import java.lang.String;
/**
 * Описываем числа
 * Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
 * "четное однозначное число" - если число четное и имеет одну цифру,
 * "нечетное однозначное число" - если число нечетное и имеет одну цифру,
 * "четное двузначное число" - если число четное и имеет две цифры,
 * "нечетное двузначное число" - если число нечетное и имеет две цифры,
 * "четное трехзначное число" - если число четное и имеет три цифры,
 * "нечетное трехзначное число" - если число нечетное и имеет три цифры.
 * Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
 *
 * Пример для числа 100:
 * четное трехзначное число
 *
 * Пример для числа 51:
 * нечетное двузначное число
 *
 *
 * Требования:
 * 1. Программа должна считывать одно число c клавиатуры.
 * 2. Программа должна использовать команду System.out.println() или System.out.print().
 * 3. Программа должна выводить только строку-описание числа и больше ничего.
 * 4. Если число четное и имеет одну цифру, вывести "четное однозначное число".
 * 5. Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
 * 6. Если число четное и имеет две цифры, вывести "четное двузначное число".
 * 7. Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
 * 8. Если число четное и имеет три цифры, вывести "четное трехзначное число".
 * 9. Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
 * 10. Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        String evenOrodd = "";
        String oneCount = "";

        while (value > 0 && value < 1000) {
            evenOrodd = value % 2 == 0 ? "четное " : "нечетное ";
            if (value / 100 >= 1 && value / 100 < 10) {
                oneCount = "трехзначное";
            } else if (value / 10 >= 1 && value / 10 < 10) {
                oneCount = "двузначное";
            } else oneCount = "однозначное";
            System.out.println(evenOrodd + oneCount + " число");
            break;
        }

    }
}
