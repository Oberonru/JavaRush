package com.javarush.task.task03.task0316;

/* 
Экранирование символов
Экранирование символов
Про экранирование символов и Escape-последовательности в Java читай в полезных ссылках от профессора-3.

Вывести на экран следующий текст - две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"


*/

public class Solution {
    public static void main(String[] args)
    {
        String s = "C:\\Program Files\\Java\\jdk1.7.0\\bin";
        String s2 = "C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\";
        char q = '"';
        System.out.println("It's Windows path: " + q + s +q);
        System.out.println("It's Java string: " + "\\" + q + s2 +q);
    }
}
