package arrays;

import java.util.Scanner;

public class pin {

	public static void main(String[] args)
	{
		final int pin=5647;
		int c=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter pin:");
			int code=sc.nextInt();
			if(code==pin)
			{
				System.out.println("Correct, welcome back!");
				break;
			}
			else if(code!=pin)
			{
				c++;
				System.out.println("Incorrect, try again!");
			}
			
		}
		if(c>=3)
		{
			System.out.println("Sorry but you have been locked out.");
		}
		
		

	}

}