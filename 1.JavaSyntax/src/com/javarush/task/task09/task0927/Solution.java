package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Десять котов
 * Есть класс кот - Cat, с полем "имя" (String).
 * Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
 * 3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
 * 4. Метод createMap должен возвращать созданный словарь.
 * 5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
 * 6. Программа должна вывести всех котов из множества на экран.
 * Десять котов
 */

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Уася", new Cat(""));
        map.put("Уася2", new Cat(""));
        map.put("Уася3", new Cat(""));
        map.put("Уася4", new Cat(""));
        map.put("Уася5", new Cat(""));
        map.put("Уася6", new Cat(""));
        map.put("Уася7", new Cat(""));
        map.put("Уася8", new Cat(""));
        map.put("Уася9", new Cat(""));
        map.put("Уася10", new Cat(""));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> mnojestvo = new HashSet<>();
        for (Map.Entry<String, Cat> mapka : map.entrySet()) {
            mnojestvo.add(mapka.getValue());
        }
        return mnojestvo;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
