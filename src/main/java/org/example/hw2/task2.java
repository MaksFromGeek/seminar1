package org.example.hw2;

import java.util.Scanner;

public class task2 {
    /**
     * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность
     * является возрастающей.
     *
     * @return boolean - является ли последовательность возрастающей
     */
    public static void main(String[] args) {
            System.out.print(isSequanceIncreasing());
        }
    public static boolean isSequanceIncreasing() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int second = sc.nextInt();
            if (second < first) {
                sc.close();
                return false;
            }
            first = second;
        }
        sc.close();
        return true;
    }
}