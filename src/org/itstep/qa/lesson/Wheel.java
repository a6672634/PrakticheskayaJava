package org.itstep.qa.lesson;
import java.util.Random;

public class Wheel {
    private int[] values;

    public Wheel() {
        values = new int[] {50,100,200,500,750,1000,1500,2000,2500,3000};
    }


    public void printValues() {
        for(int i = 0; i < values.length; i++)
            System.out.print(values[i] + " ");
    }

    public int spinWheel() {
        Random random = new Random();
        return values[random.nextInt(9)];
    }

}
