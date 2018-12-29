package com.javarush.task.task05.task0526;

/**
 * Мужчина и женщина
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * 2. У классов должны быть поля: name (String), age (int), address (String).
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * 5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 *
 *
 * Требования:
 * 1. В классе Solution создай public static класс Man.
 * 2. В классе Solution создай public static класс Woman.
 * 3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
 * 4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
 * 5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
 * 6. Конструкторы должны инициализировать переменные класса.
 * 7. В методе main необходимо создать по два объекта каждого типа.
 * 8. Метод main должен выводить созданные объекты на экран в указанном формате.
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man mujik = new Man("Уася", 38, "Урюпинск");
        Man mujik2 = new Man("Уася2", 98, "Урюпинск2");
        Woman baba = new Woman("Бабёшка", 34, "Ыжорск");
        Woman baba2 = new Woman("Бабёшка2", 94, "Ыжорск2");
        System.out.println(mujik.name + " " + mujik.age + " " + mujik.address);
        System.out.println(mujik2.name + " " + mujik2.age + " " + mujik2.address);
        System.out.println(baba.name + " " + baba.age + " " + baba.address);
        System.out.println(baba2.name + " " + baba2.age + " " + baba2.address);


    }

   public static class Man {
        public String name;
        public int age;
        public String address;

       public Man(String name, int age, String address) {
           this.name = name;
           this.age = age;
           this.address = address;
       }
   }
   public static class Woman {
       public String name;
       public int age;
       public String address;

       public Woman(String name, int age, String address) {
           this.name = name;
           this.age = age;
           this.address = address;
       }
   }
}
