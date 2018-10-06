package org.itstep.qa.runner;

import org.itstep.qa.lesson.Square;

public class SquareRunner {
    public static void main(String[] args) {
        Square square = new Square(4);
        Square square1 = new Square();
        Square square2 = new Square(2);
        square.getL();
        square.getL();
        square.S();
        square.n(2);
    }
}
