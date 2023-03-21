package org.example.hw1;
import java.util.Scanner;
public class task3 {
//Задача 3. 67. Двоичное сложение
//    Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки.
//    Входные данные: a = "11", b = "1"
//    Вывод: "100"
//    Input: a = "1010", b = "1011"
//    Output: "10101"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString1 = sc.nextLine();
        String inputString2 = sc.nextLine();
        String res = addBinary(inputString1, inputString2);
        System.out.println(res);
    }

    public static String addBinary(String a, String b) {
        int aSize = a.length();
        int bSize = b.length();
        String res = "";
        String aSum, bSum;
        int aInt, bInt, bonus = 0;
        for (int i = 0; i < Integer.max(aSize, bSize); i++) {
            if (i < aSize) {
                aSum = a.substring(aSize - 1 - i, aSize - i);
                aInt = Integer.parseInt(aSum);
            } else aInt = 0;
            if (i < bSize) {
                bSum = b.substring(bSize - 1 - i, bSize - i);
                bInt = Integer.parseInt(bSum);
            } else bInt = 0;

            int sum = aInt + bInt + bonus;
            bonus = 0;
            switch (sum) {
                case 0 -> res = "0" + res;
                case 1 -> res = "1" + res;
                case 2 -> {
                    res = "0" + res;
                    bonus = 1;
                }
                case 3 -> {
                    res = "1" + res;
                    bonus = 1;
                }
            }

        }
        if (bonus > 0) res = "1" + res;
        return res;
    }
}