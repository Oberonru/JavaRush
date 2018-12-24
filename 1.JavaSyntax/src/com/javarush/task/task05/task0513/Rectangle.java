package com.javarush.task.task05.task0513;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Собираем прямоугольник
 * Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
 * Создать для него как можно больше методов initialize(...)
 *
 * Примеры:
 * - заданы 4 параметра: left, top, width, height
 * - ширина/высота не задана (оба равны 0)
 * - высота не задана (равно ширине) создаём квадрат
 * - создаём копию другого прямоугольника (он и передаётся в параметрах)
 *
 *
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. У класса Rectangle должны быть переменные top, left, width и height с типом int.
 * 3. У класса должен быть хотя бы один метод initialize.
 * 4. У класса должно быть хотя бы два метода initialize.
 * 5. У класса должно быть хотя бы три метода initialize.
 * 6. У класса должно быть хотя бы четыре метода initialize.
Собираем прямоугольник
*/

public class Rectangle {
    public static void main(String[] args) {

    }

    int top;
    int left;
    int width;
    int height ;

    public void initialize(int top)
    {
        this.top = top;
    }
    public void initialize(int top, int lef)
    {
        this.top = top;
        left = lef;
    }
    public void initialize(int top, int lef, int widht)
    {
        this.top = top;
        left = lef;
        this.width = widht;
    }
    public void initialize(int top, int lef, int widht, int heght)
    {
        this.top = top;
        left = lef;
        this.width = widht;
        this.height  = heght;
    }

}
