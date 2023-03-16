package org.example.hw1;
// Задача 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых
// следует отрицательное число.
//        Пример ввода:
//        1 2 1 2 -1 1 3 1 3 -1 0
//        Логика расчета:
//        2 -1 переход -> 2 в сумму
//        3 -1 переход -> 3 в сумму
//        Пример вывода: 5
import java.util.Scanner;


public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения цифр, завершите нулем: ");
        int sum = 1;
        int num = scanner.nextInt();
        while (num != 0) {
            int lastNum = scanner.nextInt();
            if(lastNum > 0 && num < 0){
                sum+=lastNum;
            }
            num=lastNum;
        }
        System.out.printf("Сумма равна:" + sum);
        scanner.close();
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите цифры каждую с новой строки, нажмите 0 для завершения: ");
//        int sum = 0;
//        int num = scanner.nextInt();
//        while (num != 0) {
//            int lastNum = num;
//            num = scanner.nextInt();
//            if (num != 0) {
//                if (lastNum > 0 && num < 0) {
//                    sum += lastNum;
//                }
//            }
//        }
//        System.out.printf("Сумма цифр: %d ", sum); // + sum
//        scanner.close();
//    }
//}