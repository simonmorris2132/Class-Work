package com.company;

import java.io.*;

public class UserInput
{
    static void saveOutput(Fruit val) throws FileNotFoundException,IOException {

        ObjectOutputStream out = new ObjectOutputStream ( new FileOutputStream ( "fruitData.txt" ) );

        out.writeObject ( val );
    }
}