package org.itstep.qa.runner;

import org.itstep.qa.lesson.Bush;
import org.itstep.qa.lesson.Mouse;

import java.util.Random;

public class Game {
    private static final int SIZE_FIELD = 100;
    private static final int COUNT_BUSHES = 18;
    public static void main(String[] args) {
        String[] colours = {"Черный", "sds", "sds","sd","sdf","sdfs","sdfs","sdfs"};
        Random random = new Random();
        Bush[]arreyBushes = initBushes(colours);
        Mouse mouseOne = new Mouse(random.nextInt(SIZE_FIELD-1), random.nextInt(SIZE_FIELD-1),
                "Апокалептина",
                SIZE_FIELD);
        Mouse mouseTwo = new Mouse(random.nextInt(SIZE_FIELD-1), random.nextInt(SIZE_FIELD-1),
                "Пессимистина",
                SIZE_FIELD);
        boolean isRun = true;
        while (isRun){
            for(int i=0; i<arreyBushes.length; i++){
                if (controlWin(mouseOne, arreyBushes[i])){
                    mouseOne.setColor(arreyBushes[i].getColor());
                }
                if (controlWin(mouseTwo, arreyBushes[i])){
                    mouseTwo.setColor(arreyBushes[i].getColor());
                }
                if (controlWin(mouseOne, arreyBushes[i])) || controlWin((mouseTwo, arreyBushes[i])){
                    isRun = false;
                    break;
                }
            }
        }
        if (isRun){
            mouseOne.runMouse();
            mouseTwo.runMouse();
        }
    }
    private static boolean controlWin(Mouse mouse, Bush bush){
        if(mouse.getCourentX() == bush.getCourentX()&&
                mouse.getCourentY() == bush.getCourentY() {
            return true;
        }else {
                    return false;
        }
    }
    private static Bush[] initBushes(String[] colours){
        Bush [] bushes = new Bush[COUNT_BUSHES];
        Random random = new Random();
        for (int i = 0; i<bushes.length; i++){
            bushes[i] = new Bush(random.nextInt(SIZE_FIELD-1),
                    random.nextInt(SIZE_FIELD-1),
                    colours[random.nextInt(colours.length-1)]);
        }
        return bushes;

    }
}

