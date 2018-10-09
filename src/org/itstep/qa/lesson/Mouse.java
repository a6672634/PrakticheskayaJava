package org.itstep.qa.lesson;

import java.util.Random;

public class Mouse {
    /* Игровое поле ограничено размерами 100х100 (координаты по х и у от 0 до 99)
    На игровом поле будет бегать мышь. Мышь характеризуют:
            1. Начальные координаты.
            2. Текущие координаты
3. Имя мыши
4. Цвет мыши (в момент появления все мыши появляются белого цвета)

    Мышь умеет "бежать": изменяются ее текущие координаты на +1. Но на игровом
    поле дует ветер и мышь может дополнительно за каждый шаг убегать вперед на
    приращение ветра (случайное значение от 0 до 2). Ветер влияет на приращение
    как по х, так и по у.
    Мышь умеет "рыть тоннели": тогда ее координаты меняются сразу на +5, ветер в тоннелях
мыши не мешает.

Также на игровом поле имеется куст (несколько кустов). Каждый куст характеризуют
координаты, в которых он находится и цвет (случайный).

Процесс "игры". На игровом поле в случайных местах появляются 18 кустов. Также в
случайных местах появлются ДВЕ мыши. Мыши начинают бежать, на каждой итерации цикла
каждая мышь выполняет одну команду "бежать". Если мышь добегает до границы игрового
поля, она разворачивается в противоположную сторону от той границы, куда она
добежала и продолжает бежать вперед. Игра продолжается до тех пор, пока какая-нибудь
мышь не найдет куст. В этом случае мыши мыши останавливаются, мышь, которая нашла куст
становиться такого цвета, какого был куст. При этом в командную строку выводится
запись вида "Победила мышь Апокалиптина, она нашла куст в координатах ХХ:УУ и
перекрасилась в цвет Баклажановый""*/
    private final int FORCE_WING = 2;

    private int startX;
    private int stertY;
    private int courentX;
    private int courentY;
    private String name;
    private String color;

    private int dXRun;
    private int dYRun;

    private int dXDig;
    private int dYDig;

    private int sizeField;

    public Mouse(int startX, int stertY, String name, int sizeField) {
        this.startX = startX;
        this.stertY = stertY;
        this.courentX = startX;
        this.courentY = stertY;
        this.name = name;
        this.color = "white";
        dYRun = 1;
        dYRun = 1;
        dXRun = 5;
        dYRun = 5;
        this.sizeField =sizeField;

    }

    public void setCourentX(int courentX) {
        this.courentX = courentX;
    }

    public void setCourentY(int courentY) {
        this.courentY = courentY;
    }

    public int getCourentX() {
        return courentX;
    }

       public int getCourentY() {
        return courentY;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFORCE_WING() {
        return FORCE_WING;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStertY() {
        return stertY;
    }

    public void setStertY(int stertY) {
        this.stertY = stertY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getdXRun() {
        return dXRun;
    }

    public void setdXRun(int dXRun) {
        this.dXRun = dXRun;
    }

    public int getdYRun() {
        return dYRun;
    }

    public void setdYRun(int dYRun) {
        this.dYRun = dYRun;
    }

    public int getdXDig() {
        return dXDig;
    }

    public void setdXDig(int dXDig) {
        this.dXDig = dXDig;
    }

    public int getdYDig() {
        return dYDig;
    }

    public void setdYDig(int dYDig) {
        this.dYDig = dYDig;
    }

    public int getSizeField() {
        return sizeField;
    }

    public void setSizeField(int sizeField) {
        this.sizeField = sizeField;
    }

    public void runMouse() {
       Random random = new Random();
       int wingX = random.nextInt(FORCE_WING);
       int wingY = random.nextInt(FORCE_WING);
       dXRun = controlMouse(courentX, dXRun, wingX*dXRun);
       dYRun = controlMouse(courentY, dYRun , wingY*dYRun );
       courentX= courentX + dXRun + random.nextInt(FORCE_WING)*dXRun;
       courentY= courentY + dYRun + random.nextInt(FORCE_WING)*dYRun;
   }

    public void dig(){
        dXDig = controlMouse(courentX, dXDig, 0);
        dYDig = controlMouse(courentY, dYDig, 0);
        courentX = courentX + dXDig;
        courentY = courentY + dYDig;
    }

   private int controlMouse(int current, int d, int wing){
       int temp = current + d + wing;
       if (temp >= sizeField || temp <0){
           d = -d;
       }
       return  d;
   }

}