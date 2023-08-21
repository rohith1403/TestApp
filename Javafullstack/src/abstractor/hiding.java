package abstractor;

public class hiding {
 public static void display() 
 {
System.out.println("super class static method");
 }
 }
   class B extends hiding {
	   public static void display() 
	   {
		   System.out.println("sub class static method");
	   }
	public static void main(String[] args) {
	display();	
	}

}
