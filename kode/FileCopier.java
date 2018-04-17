import java.io.*;
import java.util.*;

public class FileCopier{

   public static void main(String[] args) throws FileNotFoundException{
   
      // create File object
      File f = new File("dataind.txt");
      while (!f.canRead()){
      // create Scanner object
      Scanner input = new Scanner(f);
      // create PrintStream
      PrintStream output = new PrintStream("dataud.txt");
      //stakit-problem: læs og skriv første ord uden mellemrum
      if (input.hasNext()){
         output.print(input.next());
         // while loop så længe der er noget at læse - hint input.hasNext
         while (input.hasNext()){
            // læs og skriv ud
            output.print(" " + input.next());
         }
         }
      }
      

      // skriv med println/print/printf...
      //output.println("Min første fil");
      //output.println("den næste linie!");
      //System.out.println("Min første fil er skrevet!");
      
      
   }

}