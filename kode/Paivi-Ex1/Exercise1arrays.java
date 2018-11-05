import java.io.*;
import java.util.Scanner;

public class Exercise1arrays
{

   public static void main(String[] args)
      throws FileNotFoundException
   {
      final int BOY = 0; //husk at drenge er index 0
      final int GIRL = 1; //og pige er index 1
      
      //åbn fil og lav skanner 
      File f = new File("Exercise1");
      Scanner input = new Scanner(f);
      //erklær variablerne
      //taellerArray til at tælle drenge (index 0) og piger (index 1)
      int[] taellerArray = new int[2];
      //sumArray til at summere drenge (index 0) og piger (index 1)
      int[] sumArray = new int[2];
      int index = 0; //index variabel til array
      int temp = 0; //temp til læsning af tal
      int forskel;
      int i = 0; //tæller til antal drenge & piger
      //while kører så længe nye elementer
      while(input.hasNext())
      {
         //vi læser det næste element
         String element = input.next();
         //drenge er lige, pigerne ulige
         //hvis modulus 0, dreng. Vi tæller antallet af piger og drenge. Vi regner summen     
         index = i % 2;
         taellerArray[index]++;
         //læs næste int fra filen
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