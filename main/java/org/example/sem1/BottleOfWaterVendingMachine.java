package org.example.sem1;

import java.util.List;
//
//public class BottleOfWaterVendingMachine implements Machine {
//
//    private final List<Product> products;
//
//    public BottleOfWaterVendingMachine(List<Product> products) {
//        this.products = products;
//    }
//
//    public Product getProduct(String name){
//        for(Product product: products){
//            if(product.getName().equalsIgnoreCase(name)){
//                return product;
//            }
//        }
//        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
//    }
//
//    public Water getProduct(String name, int volume){
//        for(Product product: products){
//            if(product instanceof Water){
//                if(product.getName().equalsIgnoreCase(name) && ((Water) product).getVolume() == volume){
//                    return (Water) product;
//                }
//            }
//
//        }
//        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
//    }
//}