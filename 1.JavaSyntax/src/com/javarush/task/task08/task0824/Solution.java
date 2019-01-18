package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/**
 * Собираем семейство
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна выводить текст на экран.
 * 2. Класс Human должен содержать четыре поля.
 * 3. Класс Human должен содержать один метод.
 * 4. Класс Solution должен содержать один метод.
 * 5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки,
 * отец, мать, трое детей и выводить все объекты Human на экран.
 * Собираем семейство
 */

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> childern = new ArrayList<>();
        childern.add(new Human("Мур1", false, 1));
        childern.add(new Human("Мур2", false, 2));
        childern.add(new Human("Мур3", true, 3));

        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(new Human("Батя", true, 50, childern));
        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(new Human("Матя", false, 45, childern));

        ArrayList<Human> greetParents = new ArrayList<>();
        greetParents.add(new Human("Дед-драндулет", true, 99, parents1));
        greetParents.add(new Human("Дед", true, 98, parents2));
        greetParents.add(new Human("Баба", false, 97, parents1));
        greetParents.add(new Human("Бабуля", false, 97, parents2));

        for (Human child : childern) {
            System.out.println(child.toString());
        }
        for (Human p1 : parents1) {
            System.out.println(p1);
        }
        for (Human p2 : parents2) {
            System.out.println(p2);
        }
        for (Human greetP : greetParents) {
            System.out.println(greetP);
        }
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount;
            if (children != null && (childCount = this.children.size()) > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
