package org.example.cw4.task3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * Заменить некратные 3 (трем) элементы списка, суммой нечетных элементов.
 */
public class task3 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(solution11(someList));
    }

    /**
     *
     * @param someList - исходный список значений
     * @return - список после изменений
     */
    private static List<Integer> solution11(List<Integer> someList) {
        int notEvenSum = 0;
        for (Integer el: someList) { // в фориче вначале указывается элемент с типом, а потом его список
            if (el % 2 == 0) {
                notEvenSum += el;
            }
        }
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) % 3 != 0) {
                someList.set(i, notEvenSum);
            }
        }
        return someList;
    }


}