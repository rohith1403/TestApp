package polymerphisam;

public class staticexample {
 public void display() {
	 System.out.println("inside display method");
 
 }
 public static float add (int a,float b) 
 {
	 System.out.println("inside int add method");
	 float c=a+b;
	return c;	 
 }
 public static void main(String[]args)
 { 
	 staticexample  m=new staticexample();
	 float d=m.add(10,20);
	 System.out.println("the d value is "+d);
	 float f=m.add (20,40);
	 System.out.println("the float value is"+f);
	 m.display();
}
}