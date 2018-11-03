import java.io.*;
import java.util.*;

public class FileCopier{

   public static void main(String[] args) throws FileNotFoundException{
   
      // åbn Scanner fra brugerens input
      Scanner consol = new Scanner(System.in);
      Scanner input = inputScanner(consol);
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
      System.out.println("Filen er kopieret til dataud.txt");
   }
            
      

   public static Scanner inputScanner(Scanner console) throws FileNotFoundException{
      //åbn fil fra brugerens input
      System.out.print("Filnavn: ");
      String filename = console.next();
      // create File object
      File f = new File(filename);
      
      //check om fil findes og spørgs indtil den gør
      while (!f.canRead()){
         //åbn fil fra brugerens input
         System.out.println("Kan ikke åbne filen. Prøv igen.");
         System.out.print("Filnavn: ");
         filename = console.next();
         // create File object
         f = new File(filename);   
      }

      // return Scanner object
      return new Scanner(f);
   }
   
}