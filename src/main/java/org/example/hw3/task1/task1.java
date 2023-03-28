package org.example.hw3.task1;
import org.example.hw3.task1.model.Items;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    /**
     * 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта
     * среди товаров, название которых содержит «высший».
     */
    public static void main(String[] args) {
        Items items1 = new Items("Яблоки высшего сорта", 100, 1);
        Items items2 = new Items("Бананы обычного сорта", 200, 3);
        Items items3 = new Items("Манго высшего сорта", 400, 2);
        Items items4 = new Items("Кокосы низшего сорта", 300, 4);

        List<Items> listItems = new ArrayList<>();
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
