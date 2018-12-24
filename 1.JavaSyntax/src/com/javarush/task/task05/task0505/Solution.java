package com.javarush.task.task05.task0505;

/**
 * Кошачья бойня
 * Создать три кота используя класс Cat.
 * Провести три боя попарно между котами.
 * Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 * Результат каждого боя вывести на экран c новой строки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. Нужно создать три объекта типа Cat.
 * 3. Нужно провести три боя.
 * 4. Программа должна вывести результат каждого боя с новой строки.
 * Кошачья бойня
 */

public class Solution {
    public static void main(String[] args) {
        Cat kuzka = new Cat("Кузька", 6, 9, 100);
        Cat murzik = new Cat("Мурзик", 5, 15, 40);
        Cat tom = new Cat("Том", 5, 8, 1);
        System.out.println(kuzka.fight(murzik));
        System.out.println(tom.fight(kuzka));
        System.out.println(murzik.fight(tom));


    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
