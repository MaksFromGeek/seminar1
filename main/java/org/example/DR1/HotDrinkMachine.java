package org.example.DR1;

import java.util.ArrayList;

public class HotDrinkMachine extends VendingMachine {

    public ArrayList getProduct(String searchName, Integer volume, Integer temperature) {
        ArrayList<Product> tempList = this.getProduct(searchName, volume);

        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotDrink item = (HotDrink) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }
}