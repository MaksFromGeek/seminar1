package org.example.cw1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        Найти количество положительных чисел, после которых следует отрицательное число.
        Scanner sc = new Scanner(System.in);
        System.out.println("введите количество чисел:  ");
        int n = sc.nextInt();
        int k = 0;
        System.out.println("введите положительные и отрицательные числа");
        int a = sc.nextInt(); // текущее число (сколько элементов используется, столько и заводится)
        for (int i = 1; i < n; i++) {
            int b = sc.nextInt(); // следущее число
            if (a > 0 && b < 0) {
                k++;
            }
            a=b;
        }
        System.out.println("k : " + k);
        sc.close();
    }
}