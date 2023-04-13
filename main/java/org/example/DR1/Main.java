package org.example.DR1;

import java.util.ArrayList;
/**
 1) Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 2) Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
 getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объему и температуре
 3) В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
 заложенную в программе
 4) Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        HotDrinkMachine machineHotDrink = new HotDrinkMachine();
        machineHotDrink.addProduct(new HotDrink("Ecpresso 0,3l", 90.0, 1, 40));
        machineHotDrink.addProduct(new HotDrink("Capuchino 0,5l", 120.0, 2, 40));
        machineHotDrink.addProduct(new HotDrink("Mocachino 0,4l", 110.0, 2, 40));
        machineHotDrink.addProduct(new HotDrink("latte 0,5l", 120.0, 2, 90));
        machineHotDrink.addProduct(new HotDrink("latte 0,3l", 100.0, 3, 50));

        ArrayList list2 = machineHotDrink.getProduct("0,5", 2, 40);
        System.out.println(list2);
    }
}

/**
 * .gitignore
 * 
 * # Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About

 */
