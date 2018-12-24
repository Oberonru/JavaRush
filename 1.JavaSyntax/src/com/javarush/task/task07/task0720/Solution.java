package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String v1 = reader.readLine();
        int N = Integer.parseInt(v1);
        String v2 = reader.readLine();
        int M = Integer.parseInt(v2);

        ArrayList<String> list = new ArrayList<String >();
        for (int i = 0; i < N; i++)
        {
            list.add(reader.readLine());
        }

        for (int i = 0; i < M ; i++)
        {
            list.add(list.get(0));
            list.remove(0);
        }

        for (int j = 0; j < list.size(); j ++)
        {
            System.out.println(list.get(j));
        }
        //напишите тут ваш код
    }
}
