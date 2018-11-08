import java.io.*;
import java.util.Scanner;

//skriv ekstra linie til referencer.txt
public class SkriveEksemplet
{
   public static void main(String[] args)
      throws FileNotFoundException
   {
      //åben input fil
      //filobjekt
      File inputFil = new File("referencer.txt");
      //scanner
      Scanner input = new Scanner(inputFil);
            
      //åben output fil
      File outputFil = new File("dat18c.txt");
      PrintStream output = new PrintStream(outputFil);
      output.println("Hello Dat18c");
      output.println("Vi kan skrive!");
      //loop gennem inputfil og skriv til outputfil
      // hasNextLine()
      while (input.hasNextLine())
      {
         // output hvad der læses fra nextLine() på input scanner
         output.println(input.nextLine());
      }
   }

}