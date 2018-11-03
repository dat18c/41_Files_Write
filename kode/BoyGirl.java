import java.io.*;
import java.util.Scanner;

public class BoyGirl
{
   public static void main(String[] args)
      throws FileNotFoundException
   {
      //brug filen boygirl.txt
      File inputFile = new File("boygirl.txt");
      //lav scanner til filen
      Scanner in = new Scanner(inputFile);
      
      //kald metode, der regner på piger og drenge
      boyGirl(in);      
   }
   
   public static void boyGirl(Scanner input)
   {
      //initialiser
      int boy = 0;
      int boySum = 0;
      int girl = 0;
      int girlSum = 0;
      String s = "";
      //så længe der er flere ord at læse
      while (input.hasNext())
      {
         s = input.next(); //læs navn og gør ikke mere ved det
         boy++; //læg en til dreng
         boySum += input.nextInt(); //læs og læg tal til drengesum
         
         if (input.hasNext()) //er der en pige efter drengen?
         {
            s= input.next(); //læs navn og gør ikke mere ved det
            girl++; //læg en til pige
            girlSum += input.nextInt(); //læs og læg tal til pigesum
         }
      }
      
      System.out.println(boy + " boys, " + girl + " girls");
      System.out.println("Difference between boys' and girls' sums: " + (girlSum - boySum));
   }
}