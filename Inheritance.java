/*   Inheritance means when we construct a new class from existing class in such a way that the new
       class access all the featuress properties of existing class.
Inheritance means  In Java, it is possible to inherit attributes and methods from one class to another. 
We group the "inheritance concept" into two categories:
        1>  subclass (child) - the class that inherits from another class
        2>  superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.   */

      // Single level inheritance : When a class inherits another class, it is known as a single inheritance. In the example given below,
    //    Dog class inherits the Animal class, so there is the single inheritance.

       class Shape{
        	 public void area() {
        		 System.out.println("Display area");
        	 }
         }
        	 class Triangle extends Shape{
        		 public void area(int l, int h) {
        		 System.out.println(2*l*h);
        	 }
         } 
         public class Oops {

     		public static void main(String[] args) {
     			
     		}
         }

         // Multilevel inheritance : When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class 
        //  inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.
         class Shape{
        	 public void area() {
        		 System.out.println("Display area");
        	 }
         }
        	 class Triangle extends Shape{
        		 public void area(int l, int h) {
        		 System.out.println(2*l*h);
        	 }
         } 
        	 class EquilateralTriangle extends Triangle{
        		 public void area(int l, int h) {
            		 System.out.println(2*l*h);
            	 }
        	 }   
         public class Oops {

     		public static void main(String[] args) {
     			
     		}
         }     

         // hierarchical inheritance : When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example 
        //  given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

             class Shape{
        	 public void area() {
        		 System.out.println("Display area");
        	 }
         }
        	 class Triangle extends Shape{
        		 public void area(int l, int h) {
        		 System.out.println(2*l*h);
        	 }
         } 
        	 class Circle extends Shape{
        		 public void area(int r) {
            		 System.out.println((3.14)*r*r);
            	 }
        	 }
        	  	 
         public class Oops {

     		public static void main(String[] args) {
     			
     		}
         }