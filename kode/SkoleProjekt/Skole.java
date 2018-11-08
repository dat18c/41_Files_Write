import java.util.Arrays;

public class Skole
{
   
   public static void main(String[] args)
   {
      
      Student[] dat18m = new Student[5];
      Student[] dat18n = new Student[5];
      
      //lav og tilføj studerende til dat18m
      dat18m[0] = new Student("Kurt Cobain", "Smells Like Teen Spirit", 20);
      dat18m[1] = new Student("Volbeat", "Heaven nor Hell", 5);
      dat18m[2] = new Student("Iron Maiden", "Killers", 45);
      dat18m[3] = new Student("Five Finger Death Punch", "Wrong Side of Heaven", 53);
      dat18m[4] = new Student("Wintersun", "Beautiful Death", 1);

      //udskriv array
      System.out.println("dat18m\n" + Arrays.toString(dat18m));
      
      //put studerende i dat18n
      dat18n[0] = new Student("Ella Fitzgeral", "Dream a Little Dream of Me", 99);
      dat18n[1] = new Student("Bjarne Lille", "Billetmærke", 666);
      dat18n[2] = new Student("John Coltrane", "Blue Train", 99);
      dat18n[3] = new Student("Kim Larsen", "This is My Life", 65);
      dat18n[4] = new Student("Charlie Parker", "All The Things You Are", 129);

      System.out.println("dat18n\n" + Arrays.toString(dat18n));
      
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