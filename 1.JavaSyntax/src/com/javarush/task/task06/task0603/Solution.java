package com.javarush.task.task06.task0603;

/**
 * По 50 000 объектов Cat и Dog
 * Создать в цикле по 50 000 объектов Cat и Dog.
 * (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
 *
 *
 * Требования:
 * 1. В классе Cat должен быть void метод finalize.
 * 2. В классе Dog должен быть void метод finalize.
 * 3. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
 * 4. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
 * 5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        Cat[] cats = new Cat[50000];
        Dog[] psina = new Dog[50000];
        for (int i = 0; i < 50000; i++) {
            cats[i] = new Cat();
            psina[i] = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
