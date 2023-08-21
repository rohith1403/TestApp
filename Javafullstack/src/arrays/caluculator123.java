package arrays;

import java.util.Scanner;

public class caluculator123{

	public static void main(String[] args) 
	{
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a,b:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Enter your option(+,-,*,/):");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			double add=a+b;
			System.out.println(add);
			break;
		case '-':
			double sub=a-b;
			System.out.println(sub);
			break;
		case '*':
			double mul=a*b;
			System.out.println(mul);
			break;
		case '/':
			double div=a/b;
			System.out.println(div);
			break;
		default:System.out.println("Invaild option!!"); 
		}
		

	}

}