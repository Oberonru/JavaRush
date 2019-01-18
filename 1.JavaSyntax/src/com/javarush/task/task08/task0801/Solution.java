package com.javarush.task.task08.task0801;

/**
 * HashSet из растений
 * Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк:
 * арбуз
 * банан
 * вишня
 * груша
 * дыня
 * ежевика
 * женьшень
 * земляника
 * ирис
 * картофель
 *
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 *
 *
 * Требования:
 * 1. Объяви переменную коллекции HashSet с типом элементов String и сразу проинициализируй ee.
 * 2. Программа не должна считывать строки с клавиатуры.
 * 3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
 * 4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("женьшень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");
        for (String text : hashSet) {
            System.out.println(text);
        }

    }
}
