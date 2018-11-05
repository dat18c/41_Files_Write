import java.io.*;
import java.util.Scanner;

public class Exercise1arrays
{

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
         temp = input.nextInt();
         sumArray[index] += temp;
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