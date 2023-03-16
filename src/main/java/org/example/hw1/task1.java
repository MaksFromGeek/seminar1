package org.example.hw1;
//Задача 1. (151. Поменять местами слова в строке, leetcode.com).
//Учитывая входную строку s, измените порядок слов в обратном порядке.
//        Пример 1: Вводим: s = "the sky is blue"; Вывод: "blue is sky the".
//        Пример 3: Вводим: s = "a good   example"; Вывод: "example good a".
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();

        var list = s.replaceAll("\\s+", " ").split(" ");
        String s2 = "";
        for (int i = 0; i < list.length; i++) {
            s2 += list[list.length - i - 1] + " ";
        }
        System.out.println("получаем строку: " + s2);
        sc.close();
    }
}







