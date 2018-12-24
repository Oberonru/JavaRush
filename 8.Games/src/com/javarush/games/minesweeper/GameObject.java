package com.javarush.games.minesweeper;
import com.javarush.engine.cell.*;

public class GameObject {
    public int x;
    public int y;
    public boolean isMine;
    public  int countMineNeighbors;
//    public Color color;

    public GameObject(int x, int y, boolean isMine){
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }


//
//    public void setCellColor(int x, int y, Color color) {
//        this.x = x;
//        this.y = y;
//        this.color = color;
//    }
}
