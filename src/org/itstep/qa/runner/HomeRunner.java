package org.itstep.qa.runner;

import org.itstep.qa.lesson.Home;

public class HomeRunner {
    public static void main(String[] args) {
        Home home = new Home(1, 2 , "Dom1");
        Home home1 = new Home (3,4 , "Dom2");
        Home home2 = new Home(5,6,"Dom3");
        home.print();
        home1.print();
        home2.print();
        home.Home(144,24);
        home1.Home(22,231);
        home2.Home(85,64);
        home.print();
        home1.print();
        home2.print();

    }
}
