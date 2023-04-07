package org.example.hw6.model;

import lombok.Data;
import java.util.*;

@Data
public class UserFilter extends Laptop {
    private boolean userHere;
    private Set<Laptop> base;
    private LinkedHashMap<Integer, String> optionList;

    public UserFilter(Set<Laptop> base) {
        super();
        generateOptionList();
        userHere = base.size() > 0;
        this.base = new LinkedHashSet<>(base);
    }

    private void generateOptionList() {
        optionList = new LinkedHashMap<>();
        optionList.put(1, "№ ноутбука");
        optionList.put(2, "RAM");
        optionList.put(3, "HDD");
        optionList.put(4, "OS");
        optionList.put(5, "color");
        optionList.put(0, "Выход");
    }

    private void printOptions() {
        HashMap<Integer, String> list = this.getOptionList();
        for (Object key : list.keySet()) {
            System.out.println(key + " - " + list.get(key) + ": " + getOptionValue(key));
        }
    }

    private String getOptionValueString(Object key) {
        Set resultSet = new TreeSet();
        for (Laptop item : base) {
            resultSet.add(item.getOptionValue(key));
        }
        String result = "";
        for (Object o : resultSet) {
            result += (result.isEmpty() ? "" : ", ") + o.toString();
        }
        return result;
    }

    public void askFilter() {
        printOptions();
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        if (userChoice == 0) this.userHere = false;
        else if (userChoice > 5) System.out.println("Вы вышли за пределы фильтра");
        else {
            System.out.println("\nВведите минимальную характеристику комплектующей ");
            askOption(userChoice);
            printFilter();
        }
    }

    private void printFilter() {
        for (Laptop item : base) {
            if (item.matchFilter(this)) {
                System.out.println(item);
            }
        }
    }

    private void askOption(int userChoice) {
        String optionName = getOptionList().get(userChoice);
        String optionList = getOptionValueString(userChoice);
        if (optionName.equals("model")) {
            optionList = "любая строка";
        }
        System.out.print(optionName + " (" + optionList + "): ");
        switch (userChoice) {
            case 1 -> this.setModel(askString());
            case 2 -> this.setRamSize(askInt());
            case 3 -> this.setDiskSize(askInt());
            case 4 -> this.setOsName(askString());
            case 5 -> this.setColor(askString());
            default -> throw new IllegalStateException("Неподдерживаемое значение: " + userChoice);
        }
    }

    private Integer askInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private String askString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}