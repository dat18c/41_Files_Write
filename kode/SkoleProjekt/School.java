import java.util.Arrays;

public class School
{
   
   public static void main(String[] args)
   {
      //taeller til at holde styr på antal studerende
      //array er 0-baseret så sidste element tilføjet vil altid være på plads (antal studerende - 1)
      int taeller = 0;
      //array med 10 studerende
      //vi kan i den simple udgave kun tilføje til der er 10 studerende
      //med taeller kan kun det sidste element tilføjes og fjernes
      //addStudent og removeStudent kan klare vilkårlig størrelse
      
      Student[] students = new Student[10];
      
      //lav og tilføj student1
      Student student1 = new Student("Kurt Cobain", "Smells Like Teen Spirit", 20);
      students[taeller] = student1;
      taeller ++; //studerende tilføjet
      
      System.out.println(student1);
      
      //tilføj en studerende direkte 
      students[taeller] = new Student("Volbeat", "Heaven nor Hell", 5);
      taeller ++; //studerende tilføjet
      
      //udskriv array
      System.out.println(Arrays.toString(students));
      
      //fjern den sidste studerende - pas på: det er pladsen før taeller
      taeller--; //fjern en studerende
      students[taeller] = null; //null sletter elementet
      
      //udskriv array
      System.out.println(Arrays.toString(students));

      //tilføj en studerende direkte 
      students[taeller] = new Student("Iron Maiden", "Killers", 45);
      taeller ++; //studerende tilføjet
      
      //udskriv array
      System.out.println(Arrays.toString(students));
      
   }
   
   //addStudent(Student[] studs, Student stud) metode, der tilføjer en ekstra studerende
   //lav et nyt array, der er et element større
   //kopier elementer til det nye array og tilføj det nye element stud
   //returner det nye array
   
   //removeStudent(Student[] studs, int index) metode, der fjerner den studerende på plads index
   //lav et nyt array, der er et element mindre
   //hvis index forskellig fra elementindex der kopieres,
   // så kopier elementer til det nye array og øg index i det nye array
   //returner det nye array
}