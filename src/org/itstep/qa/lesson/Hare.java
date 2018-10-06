package org.itstep.qa.lesson;

public class Hare {
    private final int BORN_X = 0;
    private final int BORN_Y = 0;
    private final int DX = 1;
    private final int DY = 1;
    private final int JUMP_NUMBER = 5;
    private int x;
    private int y;

    public Hare() {
        x = BORN_X;
        y = BORN_Y;
    }

    public void setX(int x) {
        this.x = this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void jump() {
        x += DX;
        y += DY;
    }

    public void jumpIfScared() {
        for(int i = 0; i < JUMP_NUMBER; i++)
            jump();
    }

    public void backHome() {
        x = BORN_X;
        x = BORN_Y;
    }

    public void setY() {
    }
}
