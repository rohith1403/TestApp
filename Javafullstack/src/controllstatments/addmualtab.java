package controllstatments;

import java.util.Scanner;

public class addmualtab {
	
		public static void main(String[] args)
		{
			int a,b,sum,mul;
			char ch;
			Scanner sc=new Scanner(System.in);
			do
			{
				System.out.println("Enter values of a and b:");
				a=sc.nextInt();
				b=sc.nextInt();
				sum=a+b;
				System.out.println("The sum of "+a+" and "+b+" is "+sum);
				for(int i=1;i<=10;i++)
				{
					
					mul=sum*i;
					System.out.println(sum+"*"+i+"="+mul);
				}
				System.out.println("Do you want continue y or n?");
				ch=sc.next().charAt(0);
			}
			while(ch=='y'||ch=='Y');
		}
}
