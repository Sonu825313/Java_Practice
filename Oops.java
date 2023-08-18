                        // OOPS Concept in java basic
                        // Class AND Objects
class Pen{
	 String color;
	 String type; // "Ballpoint, Gel"
	 
	 public void write() {
		 System.out.println("Writing Something");
	 }
	 public void printColor() {
		 System.out.println(this.color );
	 }
}
	
public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen1 = new Pen();
		pen1.color = "Blue";
		pen1.type = "Ballpoint";
		
        Pen pen2 = new Pen();
        pen2.color = "Black";
		pen2.type = "Gel";

        pen1.printColor();
        pen2.printColor();
	}  
}

          

