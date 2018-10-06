package org.itstep.qa.lesson;

public class Square {
    private double l;
    // Создать класс описывающий квадрат, который характеризуется стороной L, Создать конструктор:
// 1. Для создания экземпляра квадрата с заполненой стороной
    // 2. Для создания вырожденного квадрата с нолевой длинной стороны
    public Square(double l) {
        this.l = l;
    }
    public Square (){
        this.l = 0;
    }
    // Создать метод для работы с полями класса
    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
    // Создать метод , который выфчисляет площадь квадрата
    public double S (){
        return l*l;
    }
    //Создать метод увеличивающий площадь квадрата в N раз(принимается на вход множитель
    // метод должен каким либо образом влиять на поле)
    public void n (double N) {
        this.l = l * Math.sqrt(N) ;
    }
}
