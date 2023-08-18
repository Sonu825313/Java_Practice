
                         // Non parameterized Constructor
class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //         //  Non-parameterized constructor
     Student(){
        System.out.println("Called Constructor");  // Constructor bydefault create in java
     }

}
public class Constructor {

	public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Maddy";
        s1.age = 21;
        s1.studentInfo();
    }
}


                         // Parameterized Constructor
class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
       //  parameterized constructor
    Student(String name, int age){
       this.name = name;
       this.age = age;
     }
}
public class Constructor {

	public static void main(String[] args) {
        Student s1 = new Student("Maddy", 25);
        s1.studentInfo();
    }
}


                // Copy Constructor
class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
       //  Copy constructor
    Student(Student s2){
       this.name = s2.name;
       this.age = s2.age;
     }

     Student(){

     }
}
public class Constructor {

	public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Maddy";
        s1.age = 25;
        Student s2 = new Student(s1);
         s2.studentInfo();
    }
}
