package org.example.hw3.task3.model;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class Item {
    private String name;
    private String lastname;
    private Integer price;
    private Integer year;
    private Integer numberPages;
}
