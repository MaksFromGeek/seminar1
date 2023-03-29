package org.example.hw3.task1;
import org.example.hw3.task1.model.Item;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    /**
     * 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта
     * среди товаров, название которых содержит «высший».
     */
    public static void main(String[] args) {
        Item items1 = new Item("Яблоки высшего сорта", 100, 1);
        Item items2 = new Item("Бананы обычного сорта", 200, 3);
        Item items3 = new Item("Манго высшего сорта", 400, 2);
        Item items4 = new Item("Кокосы низшего сорта", 300, 4);

        List<Item> listItems = new ArrayList<>();
        listItems.add(items1);
        listItems.add(items2);
        listItems.add(items3);
        listItems.add(items4);

        int max = 0;
        for (int i = 0; i < listItems.size(); i++) {
            if (listItems.get(i).getName().contains("высшего")) {
                if (listItems.get(i).getPrice() > max) {
                    max = listItems.get(i).getPrice();
                }
            }
        }
        System.out.println(max);
    }
}
