package org.itstep.qa.lesson;

public class Bush { private int x;
    private int y;
    private String color;

    public Bush(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }


    public int getCourentY() {
        return courentY;
    }

    public int getCourentX() {
        return courentX;
    }
}