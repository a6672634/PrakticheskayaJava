package org.itstep.qa.lesson;

public class Home {
    //Зоздать класс описывающий дом, широта долгота , название (котедж, шалаш)
    private double shirota;
    private double dolgota;
    private String name;
    //
    public Home (double shirota, double dolgota , String name){
        this.dolgota = dolgota;
        this.shirota = shirota;
        this.name = name;
    }
    // Создать метод который передвигает дом в другую географическую точку
    public void Home (double dd, double ds){
        dolgota += dd;
        shirota += ds;
    }
    // Создать метод выводящий сводную информацию о доме в консоль

    public void print(){
        System.out.println(shirota);
        System.out.println(dolgota);
        System.out.println(name);
    }

    public double getShirota() {
        return shirota;
    }

    public void setShirota(double shirota) {
        this.shirota = shirota;
    }

    public double getDolgota() {
        return dolgota;
    }

    public void setDolgota(double dolgota) {
        this.dolgota = dolgota;
    }

    public String getNazvanie() {
        return name;
    }

    public void setNazvanie(String nazvanie) {
        this.name = nazvanie;
    }
}
//Создать конструктор , который инициализирует при создании все необходимые поля.
