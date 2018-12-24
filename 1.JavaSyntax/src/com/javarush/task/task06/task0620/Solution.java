package com.javarush.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Исправляем ошибки юности
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "Max is 25".


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить результат на экран.
3. Текст выведенный на экран должен начинаться с «Max is».
4. Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//Строка про дедушку (первая) должна соответствовать условию.
        String granddadname = reader.readLine();
        Cat catGranddad = new Cat(granddadname);
//Строка про бабушку (вторая) должна соответствовать условию.
        String grandMmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandMmotherName);
//Строка про папу (третья) должна соответствовать условию.
        String dadName  = reader.readLine();
        Cat catDead = new Cat(dadName);

// Строка про маму (четвертая) должна соответствовать условию.
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);
//Строка про сына (пятая) должна соответствовать условию.
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName);
// Строка про дочь (шестая) должна соответствовать условию.
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);


        System.out.println(catDead);
        System.out.println(catGrandmother);
        System.out.println(catDead);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
                return "Cat name is " + name + ", mother is " + parent.name;
        }
    }

}
