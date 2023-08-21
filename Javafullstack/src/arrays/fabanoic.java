package arrays;
import java.util.Scanner;
public class fabanoic {

	public static void main(String[] args)
	{
		int num,fb1=0,fb2=1,fb3=0;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter number:");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("0");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				fb3=fb1+fb2;
				fb1=fb2;
				fb2=fb3;
				System.out.print(fb3+" ");

			}
		}
	}

}