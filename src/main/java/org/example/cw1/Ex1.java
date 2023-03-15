package org.example.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        SpringApplication qwe;
        int n = scanner.nextInt();
        System.out.printf("result = %d", subtractProductAndSum(n));
    }
    /**
     * @apiNote произведение - сумма
     * @param n число
     * @return
     */
    public static int subtractProductAndSum(int n) {
        int sum = 0, multi = 1;

        while (n!=0) {
            sum += n % 10;
            multi *= n % 10;
            n/=10;
        }
        return multi - sum;
    }
}