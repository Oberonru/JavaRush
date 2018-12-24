package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. В методе draw(Game) класса Snake замени все вызовы метода setCellValue(int, int, String) на вызовы метода
 * * setCellValueEx(int, int, Color, String, Color, int) с параметрами: x, y, Color.NONE, HEAD_SIGN (или BODY_SIGN), <цвет змейки>, 75.
 * * Если змейка "неживая", ее цвет должен быть Color.RED. Иначе — любой другой, например, Color.BLACK.
 * * 4. Должен существовать публичный enum Direction со значениями: UP, RIGHT, DOWN, LEFT.
 * * 5. В классе Snake должно существовать приватное поле Direction direction, инициализированное при объявлении значением Direction.LEFT.
 * * 6. В классе Snake должен существовать публичный сеттер поля direction — setDirection(Direction), который устанавливает
 * * полю класса значение, полученное в качестве параметра.
 * Игра змейка (8/20)
 *  * Каждый ход змейка должна перемещаться. Ход занимает определенный промежуток времени, который ты можешь задать.
 *  *
 *  * Для определения логики передвижения змейки, в классе Snake создай метод void move(). В классе SnakeGame
 *  переопредели родительский метод onTurn(int). Всё, что должно происходить в игре на протяжении одного хода,
 *  описывается здесь. После передвижения змейки не забудь перерисовать игровое поле.
 *  *
 *  * Для установки продолжительности хода, создай переменную turnDelay. Игра будет начинаться со скоростью 300мс/ход.
 *  Установи продолжительность хода в момент создания игры.
 *  *
 *  *
 *  * Требования:
 *  * 1. В классе Snake должен существовать публичный метод void move().
 *  * 2. В классе SnakeGame должен быть переопределен метод onTurn(int) родительского класса Game.
 *  * 3. В методе onTurn(int) у объекта snake должен быть вызван метод move().
 *  * 4. В методе onTurn(int) должен быть вызван метод drawScene() после вызова snake.move().
 *  * 5. В классе SnakeGame должно существовать приватное поле turnDelay типа int.
 *  * 6. В методе createGame() поле turnDelay должно быть инициализировано значением 300.
 *  * 7. В методе createGame() должен вызываться метод setTurnTimer(int). В качестве параметра передай turnDelay.
 *  Игра змейка (9/20)
 * Движение змейки очень простое: в соседней с головой ячейке создается новая голова, а последний элемент (хвост) змейки удаляется.
 *
 * В классе Snake реализуй метод createNewHead(), который создает новый элемент GameObject и возвращает его. Новый
 * элемент GameObject должен создаваться рядом с элементом, в котором на данный момент находится голова змейки
 * (элемент с индексом 0 из snakeParts).
 *
 * Новый элемент GameObject создается с той стороны, куда движется змейка (поле direction).
 *
 * Пример:
 *
 * - если змейка движется влево, new GameObject(headX-1, headY);
 * - если змейка движется вниз, new GameObject(headX, headY + 1)
 *
 * Здесь headX — координата головы змеи x, headY — координата головы змеи y.
 *
 * Примечание: координаты могут быть отрицательные и/или быть за границами игрового поля.
 * Пока что это нормально, в дальнейших частях задачи исправим.
 *
 * В классе Snake создай метод removeTail() и реализуй его.
 *
 *
 * Требования:
 * 1. В классе Snake должен существовать публичный метод GameObject createNewHead().
 * 2. Метод createNewHead() должен быть реализован согласно условию.
 * 3. В классе Snake должен существовать публичный метод void removeTail().
 * 4. Метод removeTail() должен удалять последний элемент из списка snakeParts.
 */
public class Snake {

    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;
    private List<GameObject> snakeParts = new ArrayList<>();


    public Snake(int x, int y) {
        GameObject first = new GameObject(x, y);
        GameObject second = new GameObject(x + 1, y);
        GameObject third = new GameObject(x + 2, y);
        snakeParts.add(first);
        snakeParts.add(second);
        snakeParts.add(third);
    }

    public void draw(Game game) {
        if (isAlive) {
        game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.BURLYWOOD, 75);
            for (int i = 1; i < snakeParts.size(); i++) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
            }
        }
        else {
            game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.RED, 75);
            for (int i = 1; i < snakeParts.size(); i++) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED, 75);
            }
        }

//        for (GameObject gameObject : snakeParts) {
//            game.setCellValue(gameObject.x, gameObject.y, HEAD_SIGN);
//
//        }
//        for (GameObject gameObject : snakeParts) {
//            game.setCellValue(gameObject.x, gameObject.y, BODY_SIGN);
//        }
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move(){

    }

    public void createNewHead() {

    }

}

