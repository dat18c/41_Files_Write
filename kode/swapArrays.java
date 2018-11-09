//importer Arrays, så arrays kan skrives ud
import java.util.Arrays;
public class swapArrays
{
   public static void main(String[] args)
   {
      //lav to arrays med 4 tal
      int[] tal1 = { 0, 2, 4, 6 };
      int[] tal2 = { 1, 3, 5, 7 };
      
      
      //udskriv arrays
      System.out.println("tal1: " + Arrays.toString(tal1));
      System.out.println("tal2: " + Arrays.toString(tal2));

      //swap arrays - skriv metoden, der bytter om på elementerne i tal1 og tal2
      swapArrays(tal1, tal2);

      //udskriv arrays
      System.out.println("tal1: " + Arrays.toString(tal1));
      System.out.println("tal2: " + Arrays.toString(tal2));

   }

   //swapArrays - bytter elementer i arrayet
   public static void swapArrays(int[] m, int[] n)
   {
      int temp = 0;
      //loop igennem array og byt et element ad gangen
      for (int i=0;i<m.length;i++)
      {
         temp = m[i];
         m[i] = n[i];
         n[i] = temp;
      }
   }
   
}