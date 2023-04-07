package org.example.hw6;

import org.example.hw6.model.Laptop;
import org.example.hw6.model.UserFilter;
import java.util.Set;
import static org.example.hw6.model.Hardware_store.createBase;
/**
 • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 • Создать множество ноутбуков.
 • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
 ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 “Введите цифру, соответствующую необходимому критерию:
 1 - ОЗУ
 2 - Объем ЖД
 3 - Операционная система
 4 - Цвет …
 • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
 также в Map.
 • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Task {
    public static void main(String[] args) {
        Set<Laptop> base = createBase(30);
        System.out.printf("В нашем магазине представлено %d ноутбуков:%n", base.size());
        UserFilter filter = new UserFilter(base);
        while (filter.isUserHere()) {
            filter.askFilter();
        }
    }
}
