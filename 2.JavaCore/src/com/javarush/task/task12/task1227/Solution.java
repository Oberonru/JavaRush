package com.javarush.task.task12.task1227;

/**
 * CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
 * Есть интерфейсы CanFly(летать), CanSwim(плавать), CanRun(бегать).
 * Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
 * <p>
 * <p>
 * Требования:
 * 1. Класс Solution должен содержать интерфейс CanFly с методом void fly().
 * 2. Класс Solution должен содержать интерфейс CanSwim с методом void swim().
 * 3. Класс Solution должен содержать интерфейс CanRun с методом void run().
 * 4. Класс Solution должен содержать классы Duck, Penguin, Toad.
 * <p>
 * 5. Объект класса Duck должен уметь летать(поддерживать интерфейс Fly),
 * бегать(поддерживать интерфейс Run) и плавать(поддерживать интерфейс Swim).
 * 6. Объект класса Penguin должен уметь бегать(поддерживать интерфейс Run)
 * и плавать(поддерживать интерфейс Swim).
 * 7. Объект класса Toad должен уметь только плавать(поддерживать интерфейс Swim).
 * CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
 */

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly, CanSwim, CanRun {
        public void fly() {
        }

        public void swim() {
        }
        public void run() {
        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Toad implements CanSwim {
        public void swim() {
        }
    }
}
