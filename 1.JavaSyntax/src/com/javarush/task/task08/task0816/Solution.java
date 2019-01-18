package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Добрая Зинаида и летние каникулы
 * Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
 * Удалить из словаря всех людей, родившихся летом.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
 * 4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Mashkova", df.parse("AUGUST 24 1980"));
        map.put("Suloon", df.parse("JANUARY 1 1980"));
        map.put("Tulip", df.parse("MARCH 3 1980"));
        map.put("Thnfp", df.parse("FEBRUARY 24 1980"));
        map.put("Suloon2", df.parse("MAY 1 1980"));
        map.put("Lolip", df.parse("JULY 3 1980"));
        map.put("Halop", df.parse("APRIL 24 1980"));
        map.put("Qurew", df.parse("SEPTEMBER 1 1980"));
        map.put("Porjf", df.parse("DECEMBER 3 1980"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 5 && pair.getValue().getMonth() < 9) iterator.remove();
        }
    }
    public static void main(String[] args) {

    }
}
