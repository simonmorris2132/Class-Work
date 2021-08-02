package com.company;

import java.util.ArrayList;

public class Stand {

    public static ArrayList<Fruit> inventory = new ArrayList<> ();

    static int totalProfit = 0;

    static void standProfit(){
        System.out.println ("The stand has made a profit of $" + totalProfit);
    }

    static void getFruitType(String val){

        ArrayList <Fruit> fruitTypeArr = new ArrayList<> ();

        for (Fruit i: inventory) {
            if (i.fruitType == val) fruitTypeArr.add ( i );
        }
        System.out.println (fruitTypeArr);
    }


    static void displayFruit(){

        if (inventory.isEmpty ()) {
            System.out.println ( "Inventory is Empty" );
        } else if (inventory.size () == 1 )
        {System.out.println ("The Stand has " + inventory.size () + " item in its inventory");
            System.out.println (inventory);

        } else { System.out.println ("The Stand has " + inventory.size () + " items in its inventory");
            for (Fruit i:
                    inventory) {
                System.out.println (i);
            }
        }
    }
}