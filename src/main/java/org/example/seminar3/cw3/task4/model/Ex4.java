//package org.example.seminar3.cw3.task4.model;
//
//import org.example.seminar3.cw3.ArrayList;
//import org.example.seminar3.cw3.model.Coub;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//
//
//public class Ex4 {
//    /**
//     * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
//     */
//    public static void main(String[] args) {
//        org.example.seminar3.cw3.model.Coub coub1 = new org.example.seminar3.cw3.model.Coub("зеленый", 13, "деревянный");
//        org.example.seminar3.cw3.model.Coub coub2 = new org.example.seminar3.cw3.model.Coub("желтый", 73, "металлический");
//        org.example.seminar3.cw3.model.Coub coub3 = new org.example.seminar3.cw3.model.Coub("красный", 23, "картонный");
//        org.example.seminar3.cw3.model.Coub coub5 = new org.example.seminar3.cw3.model.Coub("красный", 23, "картонный");
//        org.example.seminar3.cw3.model.Coub coub6 = new org.example.seminar3.cw3.model.Coub("красный", 23, "картонный");
//        org.example.seminar3.cw3.model.Coub coub4 = new org.example.seminar3.cw3.model.Coub("желтый", 3, "металлический");
//
//        List<org.example.seminar3.cw3.model.Coub> listCoub = new ArrayList<>();
//        listCoub.add(coub1);
//        listCoub.add(coub2);
//        listCoub.add(coub3);
//        listCoub.add(coub4);
//        listCoub.add(coub5);
//        listCoub.add(coub6);
//        extracted(listCoub);
//        System.out.println("уникальная коллекция : " + unicumCollections(listCoub).size());
//
//    }
//
//    private static void extracted(List<Coub> listCoub) {
//        System.out.println("коллекция " + listCoub.size());
//    }
//
//    private static Collection<org.example.seminar3.cw3.model.Coub> unicumCollections(List<Coub> listCoub) {
//        return new HashSet<>(listCoub);
//    }
//}
