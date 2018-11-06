import java.util.Arrays;

public class School
{
   
   public static void main(String[] args)
   {
      //taeller til at holde styr på antal studerende
      //array er 0-baseret så sidste element tilføjet vil altid være på plads (antal studerende - 1)
      int taeller = 0;
      //array med 5 studerende
      //vi kan i den simple udgave kun tilføje til der er 5 studerende
      //med taeller kan kun det sidste element tilføjes og fjernes
      //addStudent og removeStudent kan klare vilkårlig størrelse
      
      Student[] dat18m = new Student[5];
      Student[] dat18n = new Student[5];
      
      //lav og tilføj student1
      Student student1 = new Student("Kurt Cobain", "Smells Like Teen Spirit", 20);
      dat18m[taeller] = student1;
      taeller ++; //studerende tilføjet
      
      System.out.println(student1);
      
      //tilføj en studerende direkte 
      dat18m[taeller] = new Student("Volbeat", "Heaven nor Hell", 5);
      taeller ++; //studerende tilføjet
      
      //udskriv array
      System.out.println(Arrays.toString(dat18m));
      
      //fjern den sidste studerende - pas på: det er pladsen før taeller
      taeller--; //fjern en studerende
      dat18m[taeller] = null; //null sletter elementet
      
      //udskriv array
      System.out.println(Arrays.toString(dat18m));

      //tilføj en studerende direkte 
      dat18m[taeller] = new Student("Iron Maiden", "Killers", 45);
      taeller ++; //studerende tilføjet
      
      //udskriv array
      System.out.println(Arrays.toString(dat18m));
      
      //put studerende i dat18n
      dat18n[0] = new Student("Ella Fitzgeral", "Dream a Little Dream of Me", 99);
      dat18n[1] = new Student("Bjarne Lille", "Billetmærke", 666);
      dat18n[2] = new Student("John Coltrane", "Blue Train", 99);
      dat18n[3] = new Student("Kim Larsen", "This is My Life", 65);
      dat18n[4] = new Student("Charlie Parker", "All The Things You Are", 129);
      
      //lav metode der bytter studerende i dat18m og dat18n
      //swapArrays(dat18m, dat18n);
      
      //udskriv arrays
      System.out.println(Arrays.toString(dat18m));
      System.out.println(Arrays.toString(dat18n));
      
   }

   //swapArrays(Students studs1, Students studs2)
         
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