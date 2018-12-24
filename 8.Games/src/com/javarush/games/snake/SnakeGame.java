package com.javarush.games.snake;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

/**
 *. В классе SnakeGame должен быть переопределен метод onTurn(int) родительского класса Game.
 *  *  * 3. В методе onTurn(int) у объекта snake должен быть вызван метод move().
 *  *  * 4. В методе onTurn(int) должен быть вызван метод drawScene() после вызова snake.move().
 *
 *   В классе SnakeGame должно существовать приватное поле turnDelay типа int.
 *  *  * 6. В методе createGame() поле turnDelay должно быть инициализировано значением 300.
 *  *  * 7. В методе createGame() должен вызываться метод setTurnTimer(int). В качестве параметра передай turnDelay.
 */
public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;

    public void initialize() {
        setScreenSize(WIDTH , HEIGHT);
        createGame();
    }

    private void createGame() {
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        drawScene();
        turnDelay = 300;
        setTurnTimer(turnDelay);

    }

    private void drawScene() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellColor(i, j, Color.GREEN);
            }
        }
        snake.draw(this);
    }

    public void onTurn(int step) {
        snake.move();
        drawScene();
    }

}
