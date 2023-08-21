package BasicsofJava;
import java.util.Scanner;
public class DesicionMakingStatements {
	public static void main( String[]args) 
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter your input:");
			int num=sc.nextInt();
			if (num>0)
			{
				System.out.println("number is postive");
			}
			else if (num==0)
			{
				System.out.println("number is zero");
			}
			 else 
			{
				System.out.println("number is negative");
			}
		}
}



