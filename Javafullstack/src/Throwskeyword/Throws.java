package Throwskeyword;

public class Throws {
public void show() throws ArithmeticException {
	int a=54;
	try {
		int b=a/0;
		if(a==54) {
			System.out.println ("inside show method");
		}
	} 
		catch(Exception e)
		{
			System.out.println ("show method");
		}
	
	System.out.println ("inside show method");
}
	public static void main(String[] args) {
		Throws obj=new Throws();
		try
		{
			obj.show();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
