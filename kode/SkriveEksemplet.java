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
      //scanner
      
      //åben output fil
      File fil = new File("dat18c.txt");
      PrintStream output = new PrintStream(fil);
      output.println("Hello Dat18c");
      output.println("Vi kan skrive!");
      //loop gennem inputfil og skriv til outputfil
   }

}