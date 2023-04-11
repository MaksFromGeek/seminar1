package org.example.DR1;

public class Drink extends Product {
    private Integer volume;

    public Drink(String name, Double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }
}
