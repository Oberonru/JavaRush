package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Перепись населения
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
 * Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String
 * состоящих из 10 записей по принципу «Фамилия» - «Имя».
 * 4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
 * 5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Петров", "Никанор");
        map.put("Иванов", "Пётр");
        map.put("Ишкандыкян", "Авраам");
        map.put("Рубенштейн", "Изя");
        map.put("Рубенштейнскис", "Изюм");
        map.put("Таблет", "Касторыч");
        map.put("Ассылов", "Даурсан");
        map.put("Ипатов", "Коловрат");
        map.put("Моржов", "Хрюн");
        map.put("Канатов", "Хрюн");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
       for(Map.Entry<String, String> mapka : map.entrySet()) {
           if (mapka.getValue().equals(name)) {
               count++;
           }
       }
       return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
       int count = 0;
       for (Map.Entry<String, String> mapka : map.entrySet()) {
           if (mapka.getKey().equals(lastName)) {
               count++;
           }
       }
        return count;
    }

    public static void main(String[] args) {

    }
}
