                      // Polymorphism is a greek words whose meaning is same object having different behaviour. 
                      // Polymorphism = poly means many and morphism means forms. it means one things for several form.


                         // there are 2 types : function overloading(Compile time) and function overriding(runtime) .

                        // function overloading: Method Overloading is a Compile time polymorphism. In method overloading, 
                        //  more than one method shares the same method name with a different signature in the class. In method overloading, 
                        // the return type can or can not be the same, but we have to change the parameter because, in java,
                        //  we can not achieve method overloading by changing only the return type of the method. 
 class Student{
	 String name;
	 int age;
	 
	 public void printInfo(String name) {
		 System.out.println(name);
	 }
	 public void printInfo(int age) {
		 System.out.println(age );
	 }
	 public void printInfo(String name, int age) {
		 System.out.println(name +" " + age);
	 }
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Blue";
		s1.age = 21;
		s1.printInfo(s1.name, s1.age);
	}  
}

            // example of method overloading
 import java.util.*;
public class MethodOverloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("add() with 2 parameters");
         System.out.println(add(4,6));
         System.out.println("add() with 3 parameters");
         System.out.println(add(4,6,8));
	}
}

            //   Method Overriding : Method Overriding is a Run time polymorphism. In method overriding, the derived class provides the 
            // specific implementation of the method that is already provided by the base class or parent class. 
            // In method overriding, the return type must be the same or co-variant (return type may vary in 
            // the same direction as the derived class). 

            // example

import java.util.*;
      // Base Class
class Animal{
	void eat() {
		System.out.println("eat() method of a base class");
		System.out.println("Eating");
	}
}
         // inherited class
 class Dog extends Animal{
	 void eat() {
		 System.out.println("eat() method of a derived class");
			System.out.println("Dog is eating");
	 }
 }
public class MethodOverriding {
   // Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dog d1 = new Dog();
          Animal a1 = new Animal();
          d1.eat();
          a1.eat();
          Animal animal = new Dog();
       // eat() method of animal class is overridden by
          // base class eat()
          animal.eat();
	}

}