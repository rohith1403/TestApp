package studentsscore;
import java.util.Scanner;
public class switcharthamatic {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a,b:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your option(+,-,*,/):");
		char ch=sc.next().charAt(0);
		switch(ch)//ch+=
		{
		case '+':
			int add=a+b;
			System.out.println(add);
			break;
		case '-':
			int sub=a-b;
			System.out.println(sub);
			break;
		case '*':
			float mul=a*b;
			System.out.println(mul);
			break;
		case '/':
			float div=a/b;
			System.out.println(div);
			break;
		default:System.out.println("Invaild option!!"); 
		}


	}




}


