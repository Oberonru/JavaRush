package com.javarush.task.task06.task0602;

/**
 * Пустые кошки, пустые псы
 * В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
 *
 *
 * Требования:
 * 1. В классе Cat должен быть void метод finalize.
 * 2. В классе Dog должен быть void метод finalize.
 * 3. В классах Cat и Dog не должно быть конструкторов или должны быть конструкторы без параметров.
 * 4. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
 * 5. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }
    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }

}

class Dog {
    protected void finalize() throws Throwable {
        System.out.println("A Dog was destroyed");
    }
}
