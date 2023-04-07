package org.example.hw6.model;

import lombok.Data;

@Data
public class Laptop {
    private String model;
    private Integer ramSize;
    private Integer diskSize;
    private String osName;
    private String color;

    public Laptop(String model, Integer ramSize, Integer diskSize, String osName, String color) {
        this.model = model;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.osName = osName;
        this.color = color;
    }

    public Laptop() {
        this.model = "";
        this.ramSize = 0;
        this.diskSize = 0;
        this.osName = "";
        this.color = "";
    }

    public boolean matchFilter(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        Laptop second = (Laptop) obj;
        return (second.model.isEmpty() || model.contains(second.model))
                & (second.ramSize.equals(0) || ramSize >= second.ramSize)
                & (second.diskSize.equals(0) || diskSize >= second.diskSize)
                & (second.osName.isEmpty() || osName.equals(second.osName))
                & (second.color.isEmpty() || color.equals(second.color));
    }

    public String toString() {
        return String.format("model: %s\tRAM: %dGB\tHDD: %dTB\tOS: %s\tColor: %s", model, ramSize, diskSize, osName, color);
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public Object getOptionValue(Object key) {
        Integer intKey = (Integer) key;
        switch (intKey) {
            case 1 -> {
                return getModel();
            }
            case 2 -> {
                return getRamSize();
            }
            case 3 -> {
                return getDiskSize();
            }
            case 4 -> {
                return getOsName();
            }
            case 5 -> {
                return getColor();
            }
            default -> {
                return "";
            }
        }
    }
}