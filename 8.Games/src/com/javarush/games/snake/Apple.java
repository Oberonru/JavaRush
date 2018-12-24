package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

/**
 * Игра змейка (7/20)
 * Объект на игровом поле может иметь одно из двух состояний: он может быть или "жив" (isAlive=true), или нет (isAlive=false).
 * Например, если змейка ударяется о край игрового поля, она умирает. То же происходит с яблоком, когда его съедает змейка.
 * Чтобы хранить состояние объектов, создай в классах Apple и Snake переменную boolean isAlive. Измени отрисовку змейки
 * таким образом, чтобы "неживая" змейка была красного цвета.
 *
 * Змейка может двигаться в одном из четырех направлений. Чтобы указать направления, создай enum Direction со
 * значениями UP, RIGHT, DOWN, LEFT, а в классе Snake — поле direction, которое будет хранить текущее направление движения.
 * Пусть изначально змейка двигается влево. Изменять направление движения змейки будем методом setDirection(Direction). Создай его.
 *
 *
 * Требования:
 * 1. В классе Apple должно существовать публичное поле boolean isAlive, инициализированное значением true.
 * 2. В классе Snake должно существовать публичное поле boolean isAlive, инициализированное значением true.
 *
 */
public class Apple extends GameObject {

    private static final String APPLE_SIGN = "\uD83C\uDF4E";
    public boolean isAlive = true;

    public Apple(int x, int y) {
        super(x, y);
    }

    public  void draw(Game game) {
        game.setCellValueEx(x, y, Color.NONE, APPLE_SIGN, Color.RED, 75);
    }
}
