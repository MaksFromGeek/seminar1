package org.example.hw2;

import java.math.BigInteger;
import java.util.Scanner;
public class task1 {
    /**
     * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
     *
     * @return sum - сумма простых чисел
     */
    public static void main(String[] args) {
        System.out.print(sumSimpleNumbers());
    }
    public static int sumSimpleNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Integer integer;
        BigInteger bigInteger;
        for (int i = 0; i < n; i++) {
            integer = sc.nextInt();
            bigInteger = BigInteger.valueOf(integer);
            if (bigInteger.isProbablePrime((int) Math.log(integer))) {
                sum += integer;
            }
        }
        return sum;
    }
}


