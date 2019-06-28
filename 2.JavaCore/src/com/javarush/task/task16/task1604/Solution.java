package com.javarush.task.task16.task1604;

/**
 * Вывод стек-трейса
 * 1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
 * 2. SpecialThread должен выводить в консоль свой стек-трейс.
 * <p>
 * Подсказка: main thread уже выводит в консоль свой стек-трейс.
 * <p>
 * <p>
 * Требования:
 * 1. Добавь в класс Solution публичный статический класс SpecialThread.
 * 2. Класс SpecialThread не должен быть унаследован от какого-либо дополнительного класса.
 * 3. Класс SpecialThread должен реализовывать интерфейс Runnable.
 * 4. Метод run класса SpecialThread должен выводить свой  стек-трейс.
 * Вывод стек-трейса
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            StackTraceElement[] elements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : elements) {
                System.out.println(element);
            }
        }
    }
}
