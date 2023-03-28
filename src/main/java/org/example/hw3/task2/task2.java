package org.example.hw3.task2;
import org.example.hw3.task2.model.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    /**
     * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {
        Item item1 = new Item("Хлеб", "Russia", 10, 100, 1);
        Item item2 = new Item("Арахисовая паста", "USA", 20, 200, 2);
        Item item3 = new Item("Макадамия", "Australia", 12, 300, 1);
        Item item4 = new Item("Чай Пуэр", "China", 12, 400, 3);

        List<Item> listItem = new ArrayList<>();
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);
        listItem.add(item4);

        Scanner sc = new Scanner(System.in);
        String minPriceName = "";
        int min = Integer.MAX_VALUE;
        int variety = sc.nextInt();
        for (int i = 0; i < listItem.size(); i++) {
            if (listItem.get(i).getVarieties() == variety) {
                if (listItem.get(i).getPrice() < min) {
                    min = listItem.get(i).getPrice();
                    minPriceName = listItem.get(i).getName();
                }
            }
        }
        sc.close();
        System.out.println(minPriceName);
    }
}
