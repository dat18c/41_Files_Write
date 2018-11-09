import java.io.*;
import java.util.Scanner;

//skriv ekstra linie til referencer.txt
public class SkriveEksemplet
{
   public static void main(String[] args)
      throws FileNotFoundException
   {
      //åben input fil
      File inputFil = new File("referencer.txt");
      //scanner
      Scanner input = new Scanner(inputFil);
            
      //åben output fil
      File outputFil = new File("dat18c.txt");
      //lav printstream
      PrintStream output = new PrintStream(outputFil);

      //loop gennem inputfil og skriv til outputfil
      // hasNextLine()
      while (input.hasNextLine())
      {
         // output hvad der læses fra nextLine() på input scanner
         //dvs. læs fra inputscanneren med nextLine()
         String tekst = input.nextLine();
         //   og skriv til output med println()
         output.println(tekst);
      }
   }

}