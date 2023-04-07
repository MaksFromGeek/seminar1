package org.example.cw6;

import java.util.*;
/**
 * 3) Найти пересечения слов в массивах и указать их общее количество.
 * Пример:
 * Mas1= [“qwe”,”asd”,”qwe”,”x”]
 * Mas2=[“qwe”,”v”]
 * Результат: qwe=3
 */
public class task3 {
    public static void main(String[] args) {
        List<String> inputArray1 = new ArrayList<>(List.of("qwe","asd","zxc", "v", "v"));
        List<String> inputArray2 = new ArrayList<>(List.of("qwe","v"));

        Set<String> cross = new HashSet<>(inputArray1);
        List<String> all = new ArrayList<>(inputArray1); // объединили 2 массива в один
        all.addAll(inputArray2);
        cross.retainAll(inputArray2);

//        for(String item : cross){
//            int count = 0;
//            for (String allItem : all){
//                if(item.equals(allItem)) count++;
//            }
//            System.out.println(item + " " + count);
//        }
//    }
//}
        Map<String, Integer> count2 = new HashMap<>();
        for(String item : cross){
            int count = 0;
            for (String allItem : all){
                if(item.equals(allItem)){
                    count++;
                    Integer itemCount = count2.get(item);
                    if(itemCount == null) itemCount = 0;
                    itemCount++;
                    count2.put(item, itemCount);
                }
            }
            System.out.println(item + " " + count);
        }
        System.out.println(count2);
    }
}