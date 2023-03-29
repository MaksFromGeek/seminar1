package org.example.seminar3.cw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 2.Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
 * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */

@Data /** Обозначили элементы для видимости в основном коде */
@AllArgsConstructor
public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evaluations;
}
