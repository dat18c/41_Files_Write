import java.io.*;
import java.util.*;

public class TestRun{

   public static void main(String[] args) throws FileNotFoundException{
   
      // create File object
      //File f = new File("data.txt");
      // create Scanner object
      //Scanner s = new Scanner(f);
      Scanner s = new Scanner(System.in);
            
      System.out.print("Movie: ");
      String filename = s.next();
      String clearLine = s.nextLine();
      PrintStream output = new PrintStream(filename);
      // out.println(in.nextLine());
      // out.println();
      System.out.println("Actors: ");
      
      String actors = s.nextLine();
      
      output.println("Actors: " + actors);
      
      System.out.println("Production Year: ");
      
      int py = s.nextInt();
      
      output.println("Production Year: " + py);
      
     
      
      
      
   }

}