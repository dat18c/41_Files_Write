import java.io.*;
import java.util.Scanner;

public class Exercise1arrays
{

   //type enum for dreng/pige
   public enum Gender
   {
      BOY, GIRL
   }

   public static void main(String[] args)
   throws FileNotFoundException
   {
      
      //�bn fil og lav skanner 
      File f = new File("Exercise1");
      Scanner input = new Scanner(f);
      //erkl�r variablerne
      //taellerArray til at t�lle drenge (index 0) og piger (index 1)
      int[] taellerArray = new int[2];
      //sumArray til at summere drenge (index 0) og piger (index 1)
      int[] sumArray = new int[2];
      int forskel;
      int i = 0;
      //while k�rer s� l�nge nye elementer
      while(input.hasNext())
      {
         //vi l�ser det n�ste element
         String element = input.next();
         //drenge er lige, pigerne ulige
         //hvis modulus 0, dreng. Vi t�ller antallet af piger og drenge. Vi regner summen     
         taellerArray[i % 2]++;
         sumArray[i % 2] += input.nextInt();
         i++ ;  
      }
    //vi printer summene og regne forskellen
    //print antal piger og drenge
    System.out.println(taellerArray[0] + " drenge " + taellerArray[1] + " piger");
    System.out.println("Drengesummen er: " + sumArray[0] + ". Pigesummen er: " + sumArray[1]);
    forskel = Math.abs(sumArray[0]-sumArray[1]);
    System.out.println("Forskellen er: " + forskel);
   }
}