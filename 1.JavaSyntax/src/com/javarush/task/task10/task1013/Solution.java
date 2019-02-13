package com.javarush.task.task10.task1013;

/**
 * Конструкторы класса Human
 * Напиши класс Human с 6 полями.
 * Придумай и реализуй 10 различных конструкторов для него.
 * Каждый конструктор должен иметь смысл.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. В классе Human должно быть 6 полей.
 * 3. Все поля класса Human должны быть private.
 * 4. В классе Human должно быть 10 конструкторов.
 * 5. Все конструкторы класса Human должны быть public.
 * Конструкторы класса Human
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int height;
        private int weight;
        private boolean sex;
        private String name;
        private String surname;

        public Human() {

        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age, int height, int weight) {
            this(age, height);
            this.weight = weight;
        }

        public Human(int age, int height, int weight, boolean sex) {
            this(age, height, weight);
            this.sex = sex;
        }

        public Human(int age, int height, int weight, boolean sex, String name) {
            this(age, height, weight, sex);
            this.name = name;
        }

        public Human(int age, int height, int weight, boolean sex, String name, String surname) {
            this(age, height, weight, sex, name);
            this.surname = surname;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, int height, String name) {
            this(age, height);
            this.name = name;
        }

        public Human(int age, boolean sex, String name) {
            this.age = age;
            this.sex = sex;
            this.name = name;
        }
    }
}
