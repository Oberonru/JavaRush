package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human greetFather = new Human("Дед - драндулет", true, 55);
        Human greetFather2 = new Human("Дедушка-пердедушка", true, 32);
        Human greetMother = new Human("Бабуля", false, 25);
        Human greetMother2 = new Human("Божий одуванчик", false, 25);
        Human batya = new Human("БАтя", true, 35, greetFather2, greetMother2);
        Human mother = new Human("Матя", false, 35, greetFather, greetMother);
        Human sohn = new Human("Сын", true, 37, batya, mother);
        Human sister = new Human("Тяпа", false, 43, batya, mother);
        Human sister2 = new Human("Тяпа2", false, 43, batya, mother);
        System.out.println(greetFather.toString());
        System.out.println(greetFather2.toString());
        System.out.println(greetMother.toString());
        System.out.println(greetMother2.toString());
        System.out.println(batya.toString());
        System.out.println(mother.toString());
        System.out.println(sohn.toString());
        System.out.println(sister);
        System.out.println(sister2);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}