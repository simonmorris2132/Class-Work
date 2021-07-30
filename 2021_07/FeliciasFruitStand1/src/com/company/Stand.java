package com.company;

/*
stand object: inventory
stand class methods: displayFruit(prints the info of all fruits available).
Data types: int, object (explicit casting...calling itself and all classes), strings
ex: Stand.inventory
*/

public class Stand {
    private Fruit[] inventory;

    public Stand(Fruit[] inv) {
        this.inventory = inv;
    }

}
