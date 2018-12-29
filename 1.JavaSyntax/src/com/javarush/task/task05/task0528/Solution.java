package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/**Вывести на экран сегодняшнюю дату
 Вывести на экран текущую дату в аналогичном виде "21 02 2014".


 Требования:
 1. Дата должна содержать день, месяц и год, разделенные пробелом.
 2. День должен соответствовать текущему.
 3. Месяц должен соответствовать текущему.
 4. Год должен соответствовать текущему.
 5. Вся дата должна быть выведена в одной строке.
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("d M y");
        System.out.println(dataFormat.format(date));
    }
}
