package arrays;

import java.util.Scanner;

public class polindrom123{

	public static void main(String[] args) 
	{
		int num,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		int n=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(n==rev)
		{
			System.out.println("The  number is palindrome number");
		}
		else
		{
			System.out.println("The  number is not palindrome number");
		}


	}
}
