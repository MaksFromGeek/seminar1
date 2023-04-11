package org.example.DR1;

import java.util.ArrayList;
/**
 1) Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 ) Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
 getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объему и температуре
 3) В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
 заложенную в программе
 4) Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

public class Main {
    public static void main(String[] args) {
        HotDrinkMachine machineHotWater = new HotDrinkMachine();
        machineHotWater.addProduct(new HotDrink("hot water 1l", 300.0, 1, 40));
        machineHotWater.addProduct(new HotDrink("hot water 2l", 300.0, 2, 40));
        machineHotWater.addProduct(new HotDrink("hot water 1l", 300.0, 2, 40));
        machineHotWater.addProduct(new HotDrink("ultra hot water 0,5l", 300.0, 2, 90));
        machineHotWater.addProduct(new HotDrink("hot water 3l", 200.0, 3, 50));

        ArrayList list2 = machineHotWater.getProduct("water", 2, 40);
        System.out.println(list2);
    }
}
