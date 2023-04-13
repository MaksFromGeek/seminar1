package org.example.DR1;

public class HotDrink extends Drink {
    private Integer temperature;

    public HotDrink(String name, Double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }
}