package com.javarush.task.task08.task0802;

/**
 * HashMap из 10 пар
 * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
 * арбуз - ягода,
 * банан - трава,
 * вишня - ягода,
 * груша - фрукт,
 * дыня - овощ,
 * ежевика - куст,
 * жень-шень - корень,
 * земляника - ягода,
 * ирис - цветок,
 * картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * Пример вывода (тут показана только одна строка):
 * картофель - клубень
 *
 *
 * Требования:
 * 1. Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
 * 4. Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("арбуз","ягода");
        dictionary.put("банан","трава");
        dictionary.put("вишня","ягода");
        dictionary.put("груша","фрукт");
        dictionary.put("дыня","овощ");
        dictionary.put("ежевика","куст");
        dictionary.put("жень-шень","корень");
        dictionary.put("земляника","ягода");
        dictionary.put("ирис","цветок");
        dictionary.put("картофель","клубень");

        for ( Map.Entry<String,String> text: dictionary.entrySet())
        {
            String key = text.getKey();
            String key2 = text.getValue();
            System.out.println(key + " - " + key2);
        }
    }
}
