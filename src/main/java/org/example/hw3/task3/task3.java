package org.example.hw3.task3;
import org.example.hw3.task3.model.Item;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class task3 {
    /**
     * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания
     * после 2010 г, включительно.
     */
    public static void main(String[] args) {
        Item book1 = new Item("Господин из Сан-Франциско", "Бунин", 300, 1834, 604);
        Item book2 = new Item("Аленький цветочек", "Аксаков", 200, 2011, 223);
        Item book3 = new Item("Мастер и Маргарита", "Булгаков", 400, 1853, 512);
        Item book4 = new Item("Руслан и Людмила", "Пушкин", 500, 1820, 215);

        List<Item> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);

        BigInteger bigInteger;
        for (Item book : listBook) {
            bigInteger = BigInteger.valueOf(book.getNumberPages());
            if (bigInteger.isProbablePrime((int) Math.log(book.getNumberPages())) && book.getLastname().contains("А")
                    && book.getYear() >= 2010) {
                System.out.println(book.getName());
            }
        }
    }
}
