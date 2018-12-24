package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

import java.util.List;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        boolean ismine = false;
        if (getRandomNumber(10) == 1) {
            ismine = true;

        }
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                gameField[i][j] = new GameObject(j, i, ismine);
                setCellColor(i, j, Color.ORANGE);
                if (ismine) {
                    countMinesOnField++;
                }
            }
        }
    }

//    private List<GameObject> getNeighbors(GameObject gameObject) {
//        return List<gameObject>();
//    }
}