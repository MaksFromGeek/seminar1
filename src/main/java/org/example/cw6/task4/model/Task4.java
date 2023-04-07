package org.example.cw6.task4.model;

import org.example.cw6.task4.model.Celsius;
import org.example.cw6.task4.model.Fahrenheit;
import org.example.cw6.task4.model.Kelvin; // можно не импортировать, если файл с кодом в одной папке с класами
/**
 * 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в Кельвины, Фаренгейты.
 * У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин.
 * Метод для конвертации назовите "convertValue".
 */
public class Task4 {
    // на leetcode.com можно замерить скорость выполнения кода
    // интерфейс будет предоставлят действия. Классы будут его реализовывать для точного пересчета
    // в зависимости от единиц измерения
    public static void main(String[] args) {
        Double t = 36.6;
        Double tFar = new Fahrenheit().convertValue(t); // создали экземпляр класса с помощью вывода класса
        System.out.println("Fahrenheit = " + tFar);

        Double tKel = new Kelvin().convertValue(-273.);
        System.out.println("Kelvin = " + tKel);

        Double tCel = new Celsius().convertValue(t);
        System.out.println("Celsius = " + tCel);
    }
}
