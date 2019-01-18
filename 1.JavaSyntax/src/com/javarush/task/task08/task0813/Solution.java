package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/**20 слов на букву «Л»
 Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".


 Требования:
 1. Не изменяй заголовок метода createSet().
 2. Программа не должна выводить текст на экран.
 3. Программа не должна считывать значения с клавиатуры.
 4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
 5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            set.add("Л" + i);
        }
        return set;
    }
    public static void main(String[] args) {
    }
}
