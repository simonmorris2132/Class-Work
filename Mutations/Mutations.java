import java.util.Arrays;

@SuppressWarnings("ALL")

public class Mutations {

    public static void run() {

        String[] strArray1 = {"Hello", "Hey"};
        String[] strArray2 = {"Boring", "Alien"};
        
      /*   for (int i = 0; i < strArray1.length; i++) {
            // strArray1[i].equals('e');
            System.out.println(Arrays.asList(strArray1[i]).contains("e"));
        } */

        /* for (int i = 0; i < strArray2.length; i++) {
            System.out.println(Arrays.asList(strArray2[i]).contains("r"));
        } */

        System.out.println(Arrays.asList(strArray2).contains("Bor"));
        System.out.println(Arrays.asList(strArray1).contains("He"));


    }

    
    
}


/* This one I'm unsure of. One problem with it is that the .contains method has a parameter which one says true if it matches whatever the list has. However, this isn't working how I want and I'm moving on lmao */