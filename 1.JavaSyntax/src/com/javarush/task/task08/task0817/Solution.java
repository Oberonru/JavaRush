package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/**
 * Нам повторы не нужны
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
 * Удалить людей, имеющих одинаковые имена.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
 * 4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
 * 5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Петров", "Никанор");
        map.put("Иванов", "Пётр");
        map.put("Ишкандыкян", "Авраам");
        map.put("Рубенштейнскис", "Изя");
        map.put("Рубенштейн", "Изюм");
        map.put("Таблет", "Касторыч");
        map.put("Ассылов", "Даурсан");
        map.put("Ипатов", "Коловрат");
        map.put("Моржов", "Хрюн");
        map.put("Канатов", "Хрюн");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        removeItemFromMapByValue(map,);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
