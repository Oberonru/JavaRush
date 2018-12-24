package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате "name + " " + age + " " + address".


Требования:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.
*/

public class Solution {
    public static void main(String[] args)
    {
        Man  mujik  = new Man("Мордак", 34,"Schtrasse");
        Man mujikkk =  new Man("Кузьмич", 56, "Rossia");
        Woman baba = new Woman("Метёлка", 23, "Omsk");
        Woman babeschka = new Woman ("Фёкла", 24, "Kolhoz");

        System.out.println(mujik.name + " " + mujik.age + " " + mujik.address);
        System.out.println(mujikkk.name + " " + mujikkk.age + " " + mujikkk.address);
        System.out.println(baba.name + " " + baba.age + " " + baba.address);
        System.out.println(babeschka.name + " " + babeschka.age + " " + babeschka.address);


    }


    public  static class Man
    {
        String  name;
        int age;
        String address;

        Man(String  name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }


    public  static class Woman
    {
        String  name;
        int age;
        String address;

        Woman(String  name, int age, String address)
        {
         this.name = name;
         this.age = age;
         this.address = address;
        }




    }


    //напишите тут ваш код
}
