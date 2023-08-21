package Throwskeyword;




public class Demo {
public void show ()throws Exception
{
	int age=65;
	try
	{
		if (age>22)
		{
			throw new Exception("Age should be greater than 22");
			
			
		}
	}
   catch (Exception e) {
	   e.getMessage();
	   
   }
   }

	public static void main(String[] args) {
	Demo obj=new Demo();
	try
	{
		obj.show();
	}
	catch(Exception e) {
		System.out.println("main method");
		e.printStackTrace();
	}
	}
}
	

	



