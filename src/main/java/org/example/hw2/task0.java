package org.example.hw2;

import org.example.cw2.model.Vector;

//Создаем класс -> создаем переменные класса -> создаем полный и пустой конструктор -> гетеры и сеттеры->
//        переопределяем toString()

public class task0 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println("Длинна вектора 1 = " +vector1.lengthVector());
        System.out.println("Длинна вектора 2 = " +vector2.lengthVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение = " + vector1.vectorMulti(vector2));
        System.out.println("Сумма векторов = " + vector1.sumVector(vector2));
        System.out.println("Разность векторов = " + vector1.difVector(vector2));
    }

}
