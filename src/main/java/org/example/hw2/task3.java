package org.example.hw2;

public class task3 {
    /**
     * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов
     * двузначных элементов массива.
     *
     * @param array - массив данных
     * @return newArray - новый массив, обработанный по правилу замены отрицательных
     *         элементов
     */
    public static void main(String[] args) {
        int[] array = exchangeNegativeElements(new int[]{1, 3, 4,
                5, 8, 23, 45, 36, -3, -6, 2});
        for (var el : array) {
            System.out.print(el + " ");
        }
    }
    public static int[] exchangeNegativeElements(int[] array) {
        int[] newArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] < 100) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[i] = sum;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
