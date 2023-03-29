package org.example.seminar3.cw3.model;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар,
 * и объем поставляемой партии в штуках. Найти страны, которые экспортируют данный(введенный с кл-ы) товар,
 * и общий объем его экспорта.
 */
@Data /** вместо гетееров и сеттеров */
@AllArgsConstructor
public class Items {
    private String name;
    private String country;
    private Double volume;
}
