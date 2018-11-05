import java.io.*;
import java.util.Scanner;

public class Exercise1arrays
{

   public static void main(String[] args)
      throws FileNotFoundException
   {
      final int BOY = 0; //husk at drenge er index 0
      final int GIRL = 1; //og pige er index 1
      
      //�bn fil og lav skanner 
      File f = new File("Exercise1");
      Scanner input = new Scanner(f);
      //erkl�r variablerne
      //taellerArray til at t�lle drenge (index 0) og piger (index 1)
      int[] taellerArray = new int[2];
      //sumArray til at summere drenge (index 0) og piger (index 1)
      int[] sumArray = new int[2];
      int index = 0; //index variabel til array
      int temp = 0; //temp til l�sning af tal
      int forskel;
      int i = 0; //t�ller til antal drenge & piger
      //while k�rer s� l�nge nye elementer
      while(input.hasNext())
      {
         //vi l�ser det n�ste element
         String element = input.next();
         //drenge er lige, pigerne ulige
         //hvis modulus 0, dreng. Vi t�ller antallet af piger og drenge. Vi regner summen     
         index = i % 2;
         taellerArray[index]++;
         //l�s n�ste int fra filen
         temp = input.nextInt();
         sumArray[index] += temp;
         i++ ;  
      }
    //vi printer summene og regne forskellen
    //print antal piger og drenge
    System.out.println(taellerArray[BOY] + " drenge " + taellerArray[GIRL] + " piger");
    System.out.println("Drengesummen er: " + sumArray[BOY] + ". Pigesummen er: " + sumArray[GIRL]);
    forskel = Math.abs(sumArray[BOY]-sumArray[GIRL]);
    System.out.println("Forskellen er: " + forskel);
   }
}