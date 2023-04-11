//package org.example.sem1;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//public class VendingMachine implements Machine {  // создали отдельный класс для управления вендинговой машиной
//
//    private ArrayList<Product> list;
//
//    public VendingMachine() { // создали пустой конструктор
//        list = new ArrayList<>(); // он кладет в лист пустой аррайЛист
//        // int[] a = {}; означает, что в переменной а будет лежать массив целых чисел
//    } // звучит как в лист положить массив элементов с типом продукт
//
//    public void addProduct(Product newItem) { // чтобы наполнить машину продуктами, создаем метод,
//        list.add(newItem); // который будет класть туда продукты. Принимает на вход продукт и кладет его
//        // во внутренний защищенный список list
//        // String searchName = new String();
//    }
//
//    public ArrayList getProductByName(String searchName) {
//        ArrayList<Product> result = new ArrayList<Product>();
//        for (Product item : list) {
//            if (item.getName().contains(searchName)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//    public ArrayList getProductByCost(Double searchCost) {
//        ArrayList<Product> result = new ArrayList<Product>();
//        for (Product item : list) {
//            if (item.getCost().equals(searchCost)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//    public ArrayList getProductByName(String searchName, Integer volume) {
//        ArrayList<Water> result = new ArrayList<Water>();
//        for (Product item : list) {
//            if (item.getName().contains(searchName) && ((Water)(item)).getVolume().equals(volume)) {
//                result.add(item);
//
//            }
//        }
//        return result;
//    }
//}
////
////    public ArrayList getProductByName(String water) {
////    }
////}