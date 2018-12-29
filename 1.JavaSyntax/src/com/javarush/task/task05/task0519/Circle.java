package com.javarush.task.task05.task0519;

/**
 * Ходим по кругу
 * Создать класс (Circle) круг, с тремя конструкторами:
 * - centerX, centerY, radius
 * - centerX, centerY, radius, width
 * - centerX, centerY, radius, width, color
 *
 *
 * Требования:
 * 1. У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
 * 2. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius и
 * инициализирующий соответствующие переменные класса.
 * 3. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width
 * и инициализирующий соответствующие переменные класса.
 * 4. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width,
 * color и инициализирующий соответствующие переменные класса.
Ходим по кругу
*/


public class Circle
{
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public Circle(int centerX,int centerY,int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(int centerX,int centerY,int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    } public Circle(int centerX,int centerY,int radius, int width, int col)
{
    this.centerX = centerX;
    this.centerY = centerY;
    this.radius = radius;
    this.width = width;
    color = col;
}



    public static void main(String[] args) {

    }
}
