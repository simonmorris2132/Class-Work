package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", 1.50F, 20, 24, 0, "Gala");
        fruit1.getFlavor();

        Meat meat1 = new Meat("Ham", 3.50F, 2, 1, 50, 30, "Pork");
        meat1.getGrade();
    }
}
