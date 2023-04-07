package org.example.cw6.task4.model;
// эти классы должны наследоваться от интерфейса Converter
public class Kelvin implements Converter {
    // имплементировали метод (говорим что здесь мы будем его реализовывать)
    @Override
    public Double convertValue(Double inputValue) {
        return inputValue + 273.15;
    }
}
