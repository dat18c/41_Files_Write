import java.io.*;
import java.util.Scanner;

public class Exercise1
{
   public static void main(String[] args)
   throws FileNotFoundException
   {
      //åbn fil og lav skanner 
      File f = new File("Exercise1");
      Scanner input = new Scanner(f);
      //erklær variablerne
      int drengeTaeller = 0;
      int pigeTaeller = 0;
      int pigeSum = 0;
      int drengeSum = 0;
      int forskel;
      int i = 0;
      //while kører så længe nye elementer
      while(input.hasNext())
      {
         //vi læser det næste element
         String element = input.next();
         //drenge er lige, pigerne ulige
         //hvis modulus 0, dreng. Vi tæller antallet af piger og drenge. Vi regner summen     
         if(i % 2 == 0)
         {
          drengeTaeller ++;
          drengeSum += input.nextInt();
          }
         //det samme med piger
         else
         {
          pigeTaeller ++;
          pigeSum += input.nextInt();        
         }
      i++ ;  
      }
    //vi printer summene og regne forskellen
    //print antal piger og drenge
    System.out.println(drengeTaeller + " drenge " + pigeTaeller + " piger");
    //Math.abs giver absolut tal, fordi jeg ikke ved, om forskellen angives negativt
    System.out.println("Drengesummen er: " + drengeSum + ". Pigesummen er: " + pigeSum);
    forskel = Math.abs(drengeSum-pigeSum);
    System.out.println("Forskellen er: " + forskel);
   }
}