import java.io.*;
import java.util.*;

public class FileReadWrite{

   public static void main(String[] args) throws FileNotFoundException{
   
      // create File object
      File f = new File("data.txt");
      // create Scanner object
      Scanner input = new Scanner(f);
      
      // while loop så længe der er noget at læse - hint input.hasNext
      while (input.hasNext()){
         // læs og skriv ud
         System.out.print(input.next());
      }
      
      // create PrintStream
      PrintStream output = new PrintStream("dataud.txt");
      // skriv med println/print/printf...
      output.println("Min første fil");
      output.println("den næste linie!");
      System.out.println("Min første fil er skrevet!");
      
      
   }

}