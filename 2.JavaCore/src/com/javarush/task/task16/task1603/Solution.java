package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/**
 * Список и нити
 * В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread,
 * работающим со своим объектом класса SpecialThread.
 * <p>
 * <p>
 * Требования:
 * 1. В методе main создай 5 объектов типа SpecialThread.
 * 2. В методе main создай 5 объектов типа Thread.
 * 3. Добавь 5 разных нитей в список list.
 * 4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
 * 5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".
 * Список и нити
 */

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread st_1 = new SpecialThread();
        Thread t_1 = new Thread(st_1);
        SpecialThread st_2 = new SpecialThread();
        Thread t_2 = new Thread(st_2);
        SpecialThread st_3 = new SpecialThread();
        Thread t_3 = new Thread(st_3);
        SpecialThread st_4 = new SpecialThread();
        Thread t_4 = new Thread(st_4);
        SpecialThread st_5 = new SpecialThread();
        Thread t_5 = new Thread(st_5);

        list.add(t_1);
        list.add(t_2);
        list.add(t_3);
        list.add(t_4);
        list.add(t_5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
