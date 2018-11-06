import java.io.*;
import java.util.Scanner;

public class CanReadSample
{

   public static void main(String[] args)
      throws FileNotFoundException
   {
      //lav ny keyboard scanner
      Scanner console = new Scanner(System.in);
      
      //lav ny filscanner vha openFil
      Scanner input =  openFil(console);
      
      //udskriv første linie fra filen
      System.out.println(input.nextLine());
   }
   
   //tag en consol scanner som input og returner en scanner koblet til fil
   public static Scanner openFil(Scanner con)
      throws FileNotFoundException
   {
      //læs filnavn fra tastaturet
      System.out.print("Angiv filnavn: ");
      String fn = con.nextLine();
      File fil = new File(fn);
      //prøv indtil filen kan læses
      while (!fil.canRead())
      {
         //prøver igen
         System.out.print("Fil kan ikke læses. Prøv igen: ");
         fn = con.nextLine();
         fil = new File(fn);
      }
      //filen kan åbnes - returner scanner på fil
      Scanner filScanner = new Scanner(fil);
      return filScanner;
   }
}