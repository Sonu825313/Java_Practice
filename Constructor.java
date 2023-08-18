
class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //         //  Non-parameterized constructor
    //  Student(){
    //     System.out.println("Called Constructor");  // Constructor bydefault create in java
    //  }

          //  parameterized constructor
    Student(String name, int age){
       this.name = name;
       this.age = age;
     }
}
public class Constructor {

	public static void main(String[] args) {
        Student s1 = new Student("Maddy", 25);
        // s1.name = "Maddy";
        // s1.age = 21;
        s1.studentInfo();
        

    }
}