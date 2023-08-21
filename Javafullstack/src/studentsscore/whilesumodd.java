package studentsscore;

import java.util.Scanner;

public class whilesumodd {

	public static void main(String[] args) {
		int sum=0,i=0,n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		System.out.println("Enter n number:");
		n=sc.nextInt();
		while(n>=i)
		{
			if(i%2!=0)
			{
				sum+=i;
				
			}
			i++;
		}
		System.out.println("The sum of even numbers from "+a+" to "+n+" = "+sum);
	  

	}
	}


