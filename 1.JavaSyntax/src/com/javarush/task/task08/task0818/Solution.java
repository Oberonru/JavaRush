package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Только для богачей
 * Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer
 * состоящих из 10 записей по принципу «фамилия» - «зарплата».
 * 4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Петров", 5200);
        map.put("Иванов", 5550);
        map.put("Ишкандыкян", 300);
        map.put("Рубенштейнскис", 50);
        map.put("Рубенштейн", 51);
        map.put("Таблет", 50);
        map.put("Ассылов", 1200);
        map.put("Ипатов", 8600);
        map.put("Моржов", 3400);
        map.put("Канатов", 3400);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
        Map.Entry<String, Integer> pair = it.next();
        String key = pair.getKey();
        Integer value = pair.getValue();
        if (value < 500) it.remove();
        }
     }

    public static void main(String[] args) {

    }
}