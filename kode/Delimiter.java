import java.io.*;
import java.util.Scanner;

public class Delimiter
{
   public static void main(String[] args)
      throws FileNotFoundException
   {
      //brug filen data.txt
      File inputFile = new File("undervisere.txt");
      //lav scanner til filen
      Scanner in = new Scanner(inputFile);
      
      //definer skilletegn
      in.useDelimiter("\t");
      
      //så længe der er flere ord at læse
      while (in.hasNext())
      {
         //udskriv næste ord
         System.out.println(in.next());
      }
   }
}