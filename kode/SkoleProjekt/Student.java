public class Student
{

   private String name;
   private String phone;
   private int age;
   
   //constructors
   public Student()
   {
      name = "";
      phone = "";
      age = 0;
   }
   
   public Student(String name, String phone, int age)
   {
      this.name = name;
      this.phone = phone;
      this.age = age;
   }
   
   //set
   public void setStudent(String name, String phone, int age)
   {
      this.name = name;
      this.phone = phone;
      this.age = age;
   }
   
   public void setStudentName(String name)
   {
      this.name = name;
   }
   
   public void setStudentPhone(String phone)
   {
      this.phone = phone;
   }
   
   public void setStudentAge(int age)
   {
      this.age = age;
   }

   public String getStudentName()
   {
      return name;
   }
   
   public String getStudentPhone()
   {
      return phone;
   }
   
   public int getStudentAge()
   {
      return age;
   }
   
   public String toString()
   {
      //use s to build string to print
      String s = "\nStudent name: " + name;
      s += "\nStudent phone: " + phone;
      s += "\nStudent age: " + age;
      s += "\n";
      return s;
   } 
}